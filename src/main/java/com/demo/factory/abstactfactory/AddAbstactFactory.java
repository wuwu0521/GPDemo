
/**  
* @Title: AdditionAbstactFactory.java  
* @Package com.demo.factory.abstactfactory  
* @Description: TODO(��һ�仰�������ļ���ʲô)  
* @author Administrator  
* @date 2019��4��15��  
* @version V1.0  
*/
package com.demo.factory.abstactfactory;

import com.demo.factory.Abscissa;
import com.demo.factory.Addition;
import com.demo.factory.Operation;
import com.demo.factory.Space;

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
