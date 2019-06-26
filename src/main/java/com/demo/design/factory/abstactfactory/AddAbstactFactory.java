
/**  
* @Title: AdditionAbstactFactory.java  
* @Package com.demo.factory.abstactfactory  
* @Description: TODO(��һ�仰�������ļ���ʲô)  
* @author Administrator  
* @date 2019��4��15��  
* @version V1.0  
*/
package com.demo.design.factory.abstactfactory;

import com.demo.design.factory.Abscissa;
import com.demo.design.factory.Addition;
import com.demo.design.factory.Operation;
import com.demo.design.factory.Space;

public class AddAbstactFactory implements OpeAbstactFactory{

	@Override
	public Operation createOperation() {
		return new Addition();
	}
	
	@Override
	public Space createSpace() {
		return new Abscissa();
	}
}
