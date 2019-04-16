
/**  
* @Title: SerializeSingleton.java  
* @Package com.demo.singleton.serialize  
* @Description: TODO(��һ�仰�������ļ���ʲô)  
* @author Administrator  
* @date 2019��4��16��  
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

	// ��дreadResolve ��ֹ���л��ƻ�����
	private Object readResolve() {
		return instance;
	}
}
