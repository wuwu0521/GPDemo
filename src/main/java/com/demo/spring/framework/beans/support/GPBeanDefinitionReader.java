package com.demo.spring.framework.beans.support;

import com.demo.spring.framework.beans.config.GPBeanDefinition;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

/**
 * 对配置文件进行查找/读取/解析
 */
public class GPBeanDefinitionReader {

    private List<String> registyBeanClass = new ArrayList<String>();

    private Properties config = new Properties();

    //扫描包路径key值
    private final String SCAN_PACKAGE = "scanPackage";

    public Properties getConfig() {
        return this.config = config;
    }

    public GPBeanDefinitionReader(String... locations) {
        InputStream is = this.getClass().getClassLoader().getResourceAsStream(locations[0].replace("classpath:", ""));
        try {
            config.load(is);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (null != is) {
                try {
                    is.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        doScanner(config.getProperty(SCAN_PACKAGE));
    }

    private void doScanner(String property) {
        URL url = this.getClass().getResource("/" + property.replaceAll("\\.", "/"));
        File classPath = new File(url.getFile());
        for (File file : classPath.listFiles()) {
            if (file.isDirectory()) {
                doScanner(property + "." + file.getName());
            } else {
                if (!file.getName().endsWith(".class")) { continue; }
                String className = (property + "." + file.getName().replace(".class", ""));
                registyBeanClass.add(className);
            }
        }
    }

    /**
     * 把配置文件扫描到的配置信息保存到GPBeanDefinition对象
     * 便于IOC操作方便
     * @return
     */
    public List<GPBeanDefinition> loadBeanDefinitions () {
        List<GPBeanDefinition> result = new ArrayList<GPBeanDefinition>();
        try {
            for (String className : registyBeanClass) {
                Class<?> beanClass = Class.forName(className);
                if (beanClass.isInterface()){continue;}
                result.add(doCreateBeanDefinition(toLowerFirstCase(beanClass.getSimpleName()),beanClass.getName()));
                Class<?> [] interfaces = beanClass.getInterfaces();
                for(Class<?> i:interfaces){
                    result.add(doCreateBeanDefinition(i.getName(),beanClass.getName()));
                }
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return result;
    }

    /**
     * 把配置信息解析成一个BeanDefinition
     * @param factoryBeanName
     * @param name
     * @return
     */
    private GPBeanDefinition doCreateBeanDefinition(String factoryBeanName, String name) {
        GPBeanDefinition beanDefinition = new GPBeanDefinition();
        beanDefinition.setBeanClassName(name);
        beanDefinition.setFactoryBeanName(factoryBeanName);
        return beanDefinition;
    }

    /**
     * 首字母大小写转换 默认首字母大写
     * @param simpleName
     * @return
     */
    private String toLowerFirstCase(String simpleName) {
        char [] chars = simpleName.toCharArray();
        chars[0] +=32;
        return String.valueOf(chars);
    }


}
