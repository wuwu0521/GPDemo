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

    //�洢����IOC��������
    private Map<String,Object> singletonBeanMap = new ConcurrentHashMap<String,Object>();

    //ͨ�õ�Ioc����
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
        //1.��λ�����ļ�
        reader = new GPBeanDefinitionReader(this.configLocations);

        //2.���������ļ���ɨ����ص��� ��װ��BeanDefinition
        List<GPBeanDefinition> beanDefinitions =reader.loadBeanDefinitions();

        //3.ע�� ��������Ϣ�ŵ��������棨αIOC������
        doRegisterBeanDefinition(beanDefinitions);
        
        //4.�ӳټ��ص��� �ӳټ��� ���ӳ�����ǰ��ʼ��
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
                throw new Exception("The ��"+beanDefinition.getFactoryBeanName()+"�� is exists!!!");
            }
            super.beanDefinitionMap.put(beanDefinition.getFactoryBeanName(),beanDefinition);
        }

    }

    /**
     * ����ע��
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
        //�Ѷ����װ��bwanWrapper
        GPBeanWrapper beanWrapper = new GPBeanWrapper(instance);
        //�õ�beanWrapper֮�󣬰�beanWrapper���浽IOC������
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
