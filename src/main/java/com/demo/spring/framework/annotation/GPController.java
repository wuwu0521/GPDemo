package com.demo.spring.framework.annotation;

import java.lang.annotation.*;

/**
 * ҳ�潻��
 */
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface GPController {
    String value() default "";
}
