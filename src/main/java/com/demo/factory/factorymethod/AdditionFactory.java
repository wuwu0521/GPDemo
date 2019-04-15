
/**  
* @Title: AdditionFactory.java  
* @Package com.demo.factory.factorymethod  
* @Description: TODO(用一句话描述该文件做什么)  
* @author Administrator  
* @date 2019年4月15日  
* @version V1.0  
*/
package com.demo.factory.factorymethod;

import com.demo.factory.Addition;
import com.demo.factory.Operation;

public class AdditionFactory implements OperationFactory{

	
	/**
	* 加法工厂类
	* @author Administrator  
	* @date 2019年4月15日   
	* @return  Operation
	*/  
	@Override
	public Operation createOperation() {
		System.out.println("加法运算");
		return new Addition();
	}

}
