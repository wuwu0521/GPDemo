
/**  
* @Title: HungryStaticSingleton.java  
* @Package com.demo.singleton.hungry  
* @Description: TODO(��һ�仰�������ļ���ʲô)  
* @author Administrator  
* @date 2019��4��16��  
* @version V1.0  
*/
package com.demo.design.singleton.hungry;

/**
 * ����ʽ��̬����鵥��
 */
public class HungryStaticSingleton {

	private static final HungryStaticSingleton instance;

	// ��̬������������ʱ���ã�����ֻ����һ��
	static {
		instance = new HungryStaticSingleton();
	}

	private HungryStaticSingleton() {
	};

	public static HungryStaticSingleton getInstance() {
		return instance;
	}
}
