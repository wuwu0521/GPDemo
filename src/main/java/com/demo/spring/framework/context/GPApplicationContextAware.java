package com.demo.spring.framework.context;

public interface GPApplicationContextAware {

    /**
     * 调用setApplicationContext方法
     * 将IOC容器注入到目标类
     * @param applicationContext
     */
    void setApplicationContext(GPApplicationContext applicationContext);
}
