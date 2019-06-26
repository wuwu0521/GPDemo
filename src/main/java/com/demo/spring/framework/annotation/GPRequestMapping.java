package com.demo.spring.framework.annotation;

import java.lang.annotation.*;

/**
 * ����url
 */
@Target({ElementType.METHOD,ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface GPRequestMapping {
    String value() default "";
}
