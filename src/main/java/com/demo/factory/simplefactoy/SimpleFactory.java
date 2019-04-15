
/**  
* @Title: SimpleFactory.java  
* @Package com.demo.factory.simplefactoy  
* @Description: TODO(��һ�仰�������ļ���ʲô)  
* @author Administrator  
* @date 2019��4��15��  
* @version V1.0  
*/
package com.demo.factory.simplefactoy;

import com.demo.factory.Operation;

public class SimpleFactory {

	public static Operation createOperation(Class<?> clazz) {
		try {
			if (null != clazz) {
				return (Operation) clazz.newInstance();
			}
		} catch (InstantiationException | IllegalAccessException e) {
			e.printStackTrace();
		}
		return null;
	}
}
