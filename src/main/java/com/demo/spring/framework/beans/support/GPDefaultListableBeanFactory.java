package com.demo.spring.framework.beans.support;

import com.demo.spring.framework.beans.config.GPBeanDefinition;
import com.demo.spring.framework.context.support.GPAbstractApplicationContext;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class GPDefaultListableBeanFactory extends GPAbstractApplicationContext {

    //�洢ע����Ϣ��beanDefinition
    protected final Map<String, GPBeanDefinition> beanDefinitionMap = new ConcurrentHashMap<String,GPBeanDefinition>();

}
