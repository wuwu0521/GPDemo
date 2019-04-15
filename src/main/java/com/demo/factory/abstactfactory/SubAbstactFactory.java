
/**  
* @Title: SubAbstactFactory.java  
* @Package com.demo.factory.abstactfactory  
* @Description: TODO(��һ�仰�������ļ���ʲô)  
* @author Administrator  
* @date 2019��4��15��  
* @version V1.0  
*/
package com.demo.factory.abstactfactory;

import com.demo.factory.Operation;
import com.demo.factory.Ordinate;
import com.demo.factory.Space;
import com.demo.factory.Subtraction;

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
