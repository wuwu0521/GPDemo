package com.demo.spring.framework.annotation;

import java.lang.annotation.*;

/**
 * Ò³Ãæ½»»¥
 */
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface GPController {
    String value() default "";
}
