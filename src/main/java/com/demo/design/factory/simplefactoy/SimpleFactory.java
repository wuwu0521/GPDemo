
/**  
* @Title: SimpleFactory.java  
* @Package com.demo.factory.simplefactoy  
* @Description: TODO(用一句话描述该文件做什么)  
* @author Administrator  
* @date 2019年4月15日  
* @version V1.0  
*/
package com.demo.design.factory.simplefactoy;

import com.demo.design.factory.Operation;

public class SimpleFactory {

	public static Operation createOperation(Class<?> clazz) {
		try {
			if (null != clazz) {
				return (Operation) clazz.newInstance();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
