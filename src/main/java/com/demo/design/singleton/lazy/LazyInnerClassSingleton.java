
/**  
* @Title: LazyInnerClassSingleton.java  
* @Package com.demo.singleton.lazy  
* @Description: TODO(��һ�仰�������ļ���ʲô)  
* @author Administrator  
* @date 2019��4��16��  
* @version V1.0  
*/
package com.demo.design.singleton.lazy;
//����ʽ��̬�ڲ��ഴ������
public class LazyInnerClassSingleton {
	/**
	 * Ĭ��ʹ��LazyInnerClassSingleton��ʱ�򣬻��ȳ�ʼ���ڲ��� ���ûʹ�õĻ����ڲ����ǲ����ص�
	 */
	private LazyInnerClassSingleton(){
		//��ֹ�����ƻ�����
		if(LazyLoder.instance!=null){
			throw new RuntimeException("�����������ʵ��");
		}
	}
	//static��Ϊ��ʹ�����Ŀռ乲��,��֤����������ᱻ��д,����
	public static final LazyInnerClassSingleton getInstance(){
		//�ڷ��ؽ����ǰ��һ�����ȼ����ڲ���
		return LazyLoder.instance;
	}
	
	private static class LazyLoder{
		private static final LazyInnerClassSingleton instance = new LazyInnerClassSingleton();
	}
}
