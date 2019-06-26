package com.demo.spring.framework.core;

/**
 * ������������ӿ�
 */
public interface GPBeanFactory {

    /**
     * ����beanName��IOC�����л��һ��ʵ��Bean
     * @param beanName
     * @return
     * @throws Exception
     */
    Object getBean(String beanName) throws Exception;

    public Object getBean(Class<?> beanClass) throws Exception;

}
