
/**  
* @Title: ThreadLocalSingleton.java  
* @Package com.demo.singleton.threadlocal  
* @Description: TODO(��һ�仰�������ļ���ʲô)  
* @author Administrator  
* @date 2019��4��16��  
* @version V1.0  
*/
package com.demo.design.singleton.threadlocal;

public class ThreadLocalSingleton {

	//�����������Դ�л� 
	private static final ThreadLocal<ThreadLocalSingleton> threadLocalInstance = new ThreadLocal<ThreadLocalSingleton>() {
		@Override
		protected ThreadLocalSingleton initialValue() {
			return new ThreadLocalSingleton();
		}
	};

	private ThreadLocalSingleton() {
	}

	public static ThreadLocalSingleton getInstance() {
		return threadLocalInstance.get();
	}
}
