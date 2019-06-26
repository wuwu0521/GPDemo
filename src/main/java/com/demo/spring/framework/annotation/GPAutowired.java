package com.demo.spring.framework.annotation;

import java.lang.annotation.*;

/**
 * �Զ�ע��
 */
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface GPAutowired {
    String value() default "";
}
