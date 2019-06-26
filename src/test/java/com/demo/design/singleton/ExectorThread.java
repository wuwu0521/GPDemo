package com.demo.design.singleton;

import com.demo.design.singleton.threadlocal.ThreadLocalSingleton;

public class ExectorThread implements Runnable{
    public void run() {
        ThreadLocalSingleton singleton = ThreadLocalSingleton.getInstance();
        System.out.println(Thread.currentThread().getName() + ":" + singleton);
    }
}
