
/**  
* @Title: TestFactoryMethod.java  
* @Package com.demo.factory  
* @Description: TODO(��һ�仰�������ļ���ʲô)  
* @author Administrator  
* @date 2019��4��15��  
* @version V1.0  
*/
package com.demo.design.factory;

import com.demo.design.factory.factorymethod.AdditionFactory;
import com.demo.design.factory.factorymethod.MultiplicationFactory;
import com.demo.design.factory.factorymethod.OperationFactory;

public class TestFactoryMethod {

	public static void main(String[] args) {
		try {
			// ʹ�÷������ʵ������������
			OperationFactory addFactory = (OperationFactory) AdditionFactory.class.newInstance();
			OperationFactory subFactory = (OperationFactory) MultiplicationFactory.class.newInstance();
			Operation add = addFactory.createOperation();
			Operation sub = subFactory.createOperation();
			// ͨ���������󴴽���Ӧ��ʵ������
			System.out.println(add.getResult(1, 1));
			System.out.println(sub.getResult(1, 1));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
