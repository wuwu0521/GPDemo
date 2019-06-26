
/**  
* @Title: SubtractionFactory.java  
* @Package com.demo.factory.factorymethod  
* @Description: TODO(��һ�仰�������ļ���ʲô)  
* @author Administrator  
* @date 2019��4��15��  
* @version V1.0  
*/
package com.demo.design.factory.factorymethod;

import com.demo.design.factory.Operation;
import com.demo.design.factory.Subtraction;

public class SubtractionFactory implements OperationFactory{

	
	/**
	* ����������
	* @author Administrator  
	* @date 2019��4��15��   
	* @return  Operation
	*/  
	@Override
	public Operation createOperation() {
		System.out.println("��������");
		return new Subtraction();
	}

}
