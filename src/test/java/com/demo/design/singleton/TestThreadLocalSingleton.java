
/**  
* @Title: TestThreadLocalSingleton.java  
* @Package com.demo.singleton  
* @Description: TODO(��һ�仰�������ļ���ʲô)  
* @author Administrator  
* @date 2019��4��16��  
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
