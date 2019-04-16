
/**  
* @Title: LazySimpleSingleton.java  
* @Package com.demo.singleton.lazy  
* @Description: TODO(用一句话描述该文件做什么)  
* @author Administrator  
* @date 2019年4月16日  
* @version V1.0  
*/
package com.demo.singleton.lazy;

/**
 * 懒汉式单例（在外部需要使用的时候才进行实例化）本身线程是不安全的
 * 加上synchronized方法同步效率过低
 */
public class LazySimpleSingleton {

	private static LazySimpleSingleton singleton;

	private LazySimpleSingleton() {

	}
	
	public  static synchronized LazySimpleSingleton getInstance() {
		if (singleton == null) {
			singleton = new LazySimpleSingleton();
		}
		return singleton;
	}
}
