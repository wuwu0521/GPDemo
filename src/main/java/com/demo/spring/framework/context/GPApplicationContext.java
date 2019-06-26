package com.demo.spring.framework.context;

import com.demo.spring.framework.annotation.GPAutowired;
import com.demo.spring.framework.annotation.GPController;
import com.demo.spring.framework.annotation.GPService;
import com.demo.spring.framework.beans.GPBeanWrapper;
import com.demo.spring.framework.beans.config.GPBeanDefinition;
import com.demo.spring.framework.beans.config.GPBeanPostProcessor;
import com.demo.spring.framework.beans.support.GPBeanDefinitionReader;
import com.demo.spring.framework.beans.support.GPDefaultListableBeanFactory;
import com.demo.spring.framework.core.GPBeanFactory;

import java.lang.reflect.Field;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.ConcurrentHashMap;

public class GPApplicationContext extends GPDefaultListableBeanFactory implements GPBeanFactory {

    private String [] configLocations;

    private GPBeanDefinitionReader reader;

    //存储单例IOC容器缓存
    private Map<String,Object> singletonBeanMap = new ConcurrentHashMap<String,Object>();

    //通用的Ioc容器
    private Map<String, GPBeanWrapper> beanWrapperMap = new ConcurrentHashMap<String, GPBeanWrapper>();

    public GPApplicationContext(String... configLocations){
        this.configLocations = configLocations;
        try {
            refresh();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void refresh() throws Exception {
        //1.定位配置文件
        reader = new GPBeanDefinitionReader(this.configLocations);

        //2.加载配置文件，扫描相关的类 封装成BeanDefinition
        List<GPBeanDefinition> beanDefinitions =reader.loadBeanDefinitions();

        //3.注册 把配置信息放到容器里面（伪IOC容器）
        doRegisterBeanDefinition(beanDefinitions);
        
        //4.延迟加载的类 延迟加载 非延迟类提前初始化
        doAutowrited();
    }

    private void doAutowrited(){
        for(Map.Entry<String,GPBeanDefinition> beanDefinitionEntry:super.beanDefinitionMap.entrySet()){
            String beanName = beanDefinitionEntry.getKey();
            if(!beanDefinitionEntry.getValue().isLazyInit()){
                try {
                    getBean(beanName);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

    private void doRegisterBeanDefinition(List<GPBeanDefinition> beanDefinitions) throws Exception {
        for (GPBeanDefinition beanDefinition:beanDefinitions){
            if(super.beanDefinitionMap.containsKey(beanDefinition.getFactoryBeanName())){
                throw new Exception("The “"+beanDefinition.getFactoryBeanName()+"” is exists!!!");
            }
            super.beanDefinitionMap.put(beanDefinition.getFactoryBeanName(),beanDefinition);
        }

    }

    /**
     * 依赖注入
     * @param beanName
     * @return
     * @throws Exception
     */
    public Object getBean(String beanName) throws Exception {
        GPBeanDefinition gpBeanDefinition = this.beanDefinitionMap.get(beanName);
        GPBeanPostProcessor gpBeanPostProcessor = new GPBeanPostProcessor();
        Object instance = instantiateBean(gpBeanDefinition);
        if (null == instance) {
            return null;
        }
        gpBeanPostProcessor.postProcessBeforeInitialization(instance,beanName);
        //把对象封装到bwanWrapper
        GPBeanWrapper beanWrapper = new GPBeanWrapper(instance);
        //拿到beanWrapper之后，把beanWrapper保存到IOC容器中
        this.beanWrapperMap.put(beanName,beanWrapper);
        gpBeanPostProcessor.postProcessAfterInitialization(instance,beanName);
        populateBean(beanName,beanWrapper);
        return beanWrapperMap.get(beanName).getWrappedInstance();
    }

    private void populateBean(String beanName, GPBeanWrapper beanWrapper) {
        Class clazz = beanWrapper.getClass();
        if(!(clazz.isAnnotationPresent(GPController.class) || clazz.isAnnotationPresent(GPService.class))){
            return;
        }
        Field [] fields = clazz.getDeclaredFields();
        for (Field field:fields){
            if(!field.isAnnotationPresent(GPAutowired.class)){
                continue;
            }
            GPAutowired autowired = field.getAnnotation(GPAutowired.class);
            String autowiredBeanName = autowired.value().trim();
            if("".equals(autowiredBeanName)){
                autowiredBeanName = field.getType().getName();
            }
            field.setAccessible(true);
            try {
                field.set(beanWrapper,this.beanWrapperMap.get(autowiredBeanName).getWrappedInstance());
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
    }


    private Object instantiateBean(GPBeanDefinition gpBeanDefinition) {
        Object instance = null;
        try {
            String className = gpBeanDefinition.getBeanClassName();
            if (this.singletonBeanMap.containsKey(className)) {
                instance = this.singletonBeanMap.get(className);
            } else {
                Class<?> clazz = Class.forName(className);
                instance = clazz.newInstance();
                this.singletonBeanMap.put(gpBeanDefinition.getFactoryBeanName(),instance);
            }
            return instance;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public Object getBean(Class<?> beanClass) throws Exception {
        return null;
    }

    public String[] getBeanDefinitionNames() {
        return this.beanDefinitionMap.keySet().toArray(new String[this.beanDefinitionMap.size()]);
    }

    public Properties getConfig(){
        return this.reader.getConfig();
    }
}
