
/**  
* @Title: SubtractionFactory.java  
* @Package com.demo.factory.factorymethod  
* @Description: TODO(用一句话描述该文件做什么)  
* @author Administrator  
* @date 2019年4月15日  
* @version V1.0  
*/
package com.demo.design.factory.factorymethod;

import com.demo.design.factory.Operation;
import com.demo.design.factory.Subtraction;

public class SubtractionFactory implements OperationFactory{

	
	/**
	* 减法工厂类
	* @author Administrator  
	* @date 2019年4月15日   
	* @return  Operation
	*/  
	@Override
	public Operation createOperation() {
		System.out.println("减法运算");
		return new Subtraction();
	}

}
