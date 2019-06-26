
/**  
* @Title: HungryStaticSingleton.java  
* @Package com.demo.singleton.hungry  
* @Description: TODO(用一句话描述该文件做什么)  
* @author Administrator  
* @date 2019年4月16日  
* @version V1.0  
*/
package com.demo.design.singleton.hungry;

/**
 * 饿汉式静态代码块单例
 */
public class HungryStaticSingleton {

	private static final HungryStaticSingleton instance;

	// 静态代码块在类加载时调用，并且只调用一次
	static {
		instance = new HungryStaticSingleton();
	}

	private HungryStaticSingleton() {
	};

	public static HungryStaticSingleton getInstance() {
		return instance;
	}
}
