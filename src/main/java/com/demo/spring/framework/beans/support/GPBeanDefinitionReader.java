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
 * �������ļ����в���/��ȡ/����
 */
public class GPBeanDefinitionReader {

    private List<String> registyBeanClass = new ArrayList<String>();

    private Properties config = new Properties();

    //ɨ���·��keyֵ
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
     * �������ļ�ɨ�赽��������Ϣ���浽GPBeanDefinition����
     * ����IOC��������
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
     * ��������Ϣ������һ��BeanDefinition
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
     * ����ĸ��Сдת�� Ĭ������ĸ��д
     * @param simpleName
     * @return
     */
    private String toLowerFirstCase(String simpleName) {
        char [] chars = simpleName.toCharArray();
        chars[0] +=32;
        return String.valueOf(chars);
    }


}
