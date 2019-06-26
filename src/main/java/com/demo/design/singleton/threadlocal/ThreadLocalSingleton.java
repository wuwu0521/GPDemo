
/**  
* @Title: ThreadLocalSingleton.java  
* @Package com.demo.singleton.threadlocal  
* @Description: TODO(用一句话描述该文件做什么)  
* @author Administrator  
* @date 2019年4月16日  
* @version V1.0  
*/
package com.demo.design.singleton.threadlocal;

public class ThreadLocalSingleton {

	//适用里多数据源切换 
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
