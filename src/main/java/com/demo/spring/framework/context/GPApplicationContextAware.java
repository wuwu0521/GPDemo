package com.demo.spring.framework.context;

public interface GPApplicationContextAware {

    /**
     * ����setApplicationContext����
     * ��IOC����ע�뵽Ŀ����
     * @param applicationContext
     */
    void setApplicationContext(GPApplicationContext applicationContext);
}
