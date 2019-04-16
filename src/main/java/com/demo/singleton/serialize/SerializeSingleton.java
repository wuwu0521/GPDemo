
/**  
* @Title: SerializeSingleton.java  
* @Package com.demo.singleton.serialize  
* @Description: TODO(用一句话描述该文件做什么)  
* @author Administrator  
* @date 2019年4月16日  
* @version V1.0  
*/
package com.demo.singleton.serialize;

public class SerializeSingleton {

	public final static SerializeSingleton instance = new SerializeSingleton();

	private SerializeSingleton() {
	};

	public static SerializeSingleton getInstance() {
		return instance;
	}

	// 重写readResolve 防止序列化破坏单例
	private Object readResolve() {
		return instance;
	}
}
