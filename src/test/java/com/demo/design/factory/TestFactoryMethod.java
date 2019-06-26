
/**  
* @Title: TestFactoryMethod.java  
* @Package com.demo.factory  
* @Description: TODO(用一句话描述该文件做什么)  
* @author Administrator  
* @date 2019年4月15日  
* @version V1.0  
*/
package com.demo.design.factory;

import com.demo.design.factory.factorymethod.AdditionFactory;
import com.demo.design.factory.factorymethod.MultiplicationFactory;
import com.demo.design.factory.factorymethod.OperationFactory;

public class TestFactoryMethod {

	public static void main(String[] args) {
		try {
			// 使用反射机制实例化工厂对象
			OperationFactory addFactory = (OperationFactory) AdditionFactory.class.newInstance();
			OperationFactory subFactory = (OperationFactory) MultiplicationFactory.class.newInstance();
			Operation add = addFactory.createOperation();
			Operation sub = subFactory.createOperation();
			// 通过工厂对象创建相应的实例对象
			System.out.println(add.getResult(1, 1));
			System.out.println(sub.getResult(1, 1));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
