
/**  
* @Title: OperationFactory.java  
* @Package com.demo.factory.factorymethod  
* @Description: TODO(用一句话描述该文件做什么)  
* @author Administrator  
* @date 2019年4月15日  
* @version V1.0  
*/
package com.demo.design.factory.factorymethod;

import com.demo.design.factory.Operation;

public interface OperationFactory {

	public Operation createOperation();
}
