
/**  
* @Title: LazyDoubleCheckSingleton.java  
* @Package com.demo.singleton.lazy  
* @Description: TODO(��һ�仰�������ļ���ʲô)  
* @author Administrator  
* @date 2019��4��16��  
* @version V1.0  
*/
package com.demo.design.singleton.lazy;

/**
 * ����ʽ����
 */
public class LazyDoubleCheckSingleton {
	//volatile��֤�ɼ��ԣ�����֤ԭ����
	private volatile static LazyDoubleCheckSingleton instance;
	
	private LazyDoubleCheckSingleton(){}
	
	//synchronized���������ǻ�������LazySimpleSingleton���������������getInstance()
	public static LazyDoubleCheckSingleton getInstance(){
		if(instance==null){
			synchronized (LazyDoubleCheckSingleton.class) {
				//˫��У��
				//�˴��п�����,ǰһ����ռ�������߳��Ѿ������˸�ʵ��,���Ǻ���Ĳ����߳��õ���֮������ֻᴴ��һ��
				if(instance==null){
					instance = new LazyDoubleCheckSingleton();
				}
			}
		}
		return instance;
	}
}
