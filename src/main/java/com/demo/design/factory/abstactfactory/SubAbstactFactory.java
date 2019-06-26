
/**  
* @Title: SubAbstactFactory.java  
* @Package com.demo.factory.abstactfactory  
* @Description: TODO(��һ�仰�������ļ���ʲô)  
* @author Administrator  
* @date 2019��4��15��  
* @version V1.0  
*/
package com.demo.design.factory.abstactfactory;

import com.demo.design.factory.Operation;
import com.demo.design.factory.Ordinate;
import com.demo.design.factory.Space;
import com.demo.design.factory.Subtraction;

public class SubAbstactFactory implements OpeAbstactFactory{

	@Override
	public Operation createOperation() {
		return new Subtraction();
	}

	@Override
	public Space createSpace() {
		return new Ordinate();
	}

}
