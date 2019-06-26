package com.demo.spring.demo;

import com.demo.spring.framework.context.GPApplicationContext;

public class SpringApplication {

    public static void main(String[] args) {
        GPApplicationContext applicationContext = new GPApplicationContext("classpath:application.properties");
    }
}
