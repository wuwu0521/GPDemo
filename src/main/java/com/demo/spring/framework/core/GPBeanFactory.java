package com.demo.spring.framework.core;

/**
 * 单例工厂顶层接口
 */
public interface GPBeanFactory {

    /**
     * 根据beanName从IOC容器中获得一个实例Bean
     * @param beanName
     * @return
     * @throws Exception
     */
    Object getBean(String beanName) throws Exception;

    public Object getBean(Class<?> beanClass) throws Exception;

}
