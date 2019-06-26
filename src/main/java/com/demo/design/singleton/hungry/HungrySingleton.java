
/**  
* @Title: HungrySingleton.java  
* @Package com.demo.singleton.hungry  
* @Description: TODO(��һ�仰�������ļ���ʲô)  
* @author Administrator  
* @date 2019��4��16��  
* @version V1.0  
*/
package com.demo.design.singleton.hungry;

/**
 * ����ʽ����
 * 	��������ص�ʱ���������ʼ�������Ҵ����������󣩾����̰߳�ȫ�����̻߳�û������ǰ����ʵ�����ˣ������ܴ��ڷ��ʰ�ȫ����
 *		�ŵ㣺
 *			û�м��κε�����ִ��Ч�ʱȽϸߣ�
 *			���û���������˵��������ʽ����
 *		ȱ�㣺
 *			����ص�ʱ��ͳ�ʼ�����������û��ǲ��ã��Ҷ�ռ�ſռ�
 * 			�˷����ڴ棬�п���ռ��é�Ӳ���ʺ
 */
public class HungrySingleton {
	
	private static final HungrySingleton instance = new HungrySingleton();
	
	private HungrySingleton(){}
	
	public static HungrySingleton getInstance(){
		return instance;
	}
}
