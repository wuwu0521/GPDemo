package com.demo.spring.framework.annotation;

import java.lang.annotation.*;

/**
 * ҵ���߼���ע��ӿ�
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface GPService {
    String value() default "";
}
