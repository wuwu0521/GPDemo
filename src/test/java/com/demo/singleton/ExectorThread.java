package com.demo.singleton;

import com.demo.singleton.threadlocal.ThreadLocalSingleton;

public class ExectorThread implements Runnable{
    public void run() {
        ThreadLocalSingleton singleton = ThreadLocalSingleton.getInstance();
        System.out.println(Thread.currentThread().getName() + ":" + singleton);
    }
}
