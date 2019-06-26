
/**  
* @Title: TestThreadLocalSingleton.java  
* @Package com.demo.singleton  
* @Description: TODO(用一句话描述该文件做什么)  
* @author Administrator  
* @date 2019年4月16日  
* @version V1.0  
*/
package com.demo.design.singleton;

import com.demo.design.singleton.threadlocal.ThreadLocalSingleton;

public class TestThreadLocalSingleton {

	
	public static void main(String[] args) {
		System.out.println(ThreadLocalSingleton.getInstance());
	    System.out.println(ThreadLocalSingleton.getInstance());
	    System.out.println(ThreadLocalSingleton.getInstance());
	    System.out.println(ThreadLocalSingleton.getInstance());
	    System.out.println(ThreadLocalSingleton.getInstance());

	    Thread t1 = new Thread(new ExectorThread());
	    Thread t2 = new Thread(new ExectorThread());
	    t1.start();
	    t2.start();
	    System.out.println("End");
	}
}
