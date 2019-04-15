
/**  
* @Title: AdditionAbstactFactory.java  
* @Package com.demo.factory.abstactfactory  
* @Description: TODO(用一句话描述该文件做什么)  
* @author Administrator  
* @date 2019年4月15日  
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
