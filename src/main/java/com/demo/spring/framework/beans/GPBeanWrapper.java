package com.demo.spring.framework.beans;

public class GPBeanWrapper {

    private Object wrappedInstance;

    private Class<?> wrappedClass;

    public GPBeanWrapper(Object wrappedInstance) {
        this.wrappedInstance = wrappedInstance;
    }

    public Object getWrappedInstance(){
        return this.wrappedInstance;
    }

    /**
     * 放回代理以后的Class 可能是$proxy0
     * @return
     */
    public Class<?> getWrappedClass(){
        return this.wrappedInstance.getClass();
    }
}
