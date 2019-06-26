package com.demo.spring.framework.annotation;

import java.lang.annotation.*;

/**
 * «Î«Û≤Œ ˝”≥…‰
 */
@Target(ElementType.PARAMETER)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface GPRequestParam {
    String value() default "";

    boolean required() default true;
}
