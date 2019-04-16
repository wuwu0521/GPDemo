
/**  
* @Title: LazySimpleSingleton.java  
* @Package com.demo.singleton.lazy  
* @Description: TODO(��һ�仰�������ļ���ʲô)  
* @author Administrator  
* @date 2019��4��16��  
* @version V1.0  
*/
package com.demo.singleton.lazy;

/**
 * ����ʽ���������ⲿ��Ҫʹ�õ�ʱ��Ž���ʵ�����������߳��ǲ���ȫ��
 * ����synchronized����ͬ��Ч�ʹ���
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
