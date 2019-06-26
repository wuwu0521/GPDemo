package com.demo.spring.framework.beans.config;

/**
 * �����洢�����ļ��е���Ϣ
 * �൱�ڱ������ڴ��е�����
 */
public class GPBeanDefinition {

    private String beanClassName;

    private boolean lazyInit = false;

    private String factoryBeanName;


    public String getBeanClassName() {
        return beanClassName;
    }

    public void setBeanClassName(String beanClassName) {
        this.beanClassName = beanClassName;
    }

    public boolean isLazyInit() {
        return lazyInit;
    }

    public void setLazyInit(boolean lazyInit) {
        this.lazyInit = lazyInit;
    }

    public String getFactoryBeanName() {
        return factoryBeanName;
    }

    public void setFactoryBeanName(String factoryBeanName) {
        this.factoryBeanName = factoryBeanName;
    }
}
