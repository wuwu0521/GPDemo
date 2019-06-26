
/**  
* @Title: AdditionAbstactFactory.java  
* @Package com.demo.factory.abstactfactory  
* @Description: TODO(用一句话描述该文件做什么)  
* @author Administrator  
* @date 2019年4月15日  
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
