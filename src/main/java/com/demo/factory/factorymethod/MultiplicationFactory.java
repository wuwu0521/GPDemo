
/**  
* @Title: Multiplication.java  
* @Package com.demo.factory.factorymethod  
* @Description: TODO(��һ�仰�������ļ���ʲô)  
* @author Administrator  
* @date 2019��4��15��  
* @version V1.0  
*/
package com.demo.factory.factorymethod;

import com.demo.factory.Multiplication;
import com.demo.factory.Operation;

public class MultiplicationFactory implements OperationFactory{

	
	/**
	* �˷�������
	* @author Administrator  
	* @date 2019��4��15��   
	* @return  Operation
	*/  
	@Override
	public Operation createOperation() {
		System.out.println("�˷�����");
		return new Multiplication();
	}

}
