
/**  
* @Title: OpeAbstactFactory.java  
* @Package com.demo.factory.abstactfactory  
* @Description: TODO(��һ�仰�������ļ���ʲô)  
* @author Administrator  
* @date 2019��4��15��  
* @version V1.0  
*/
package com.demo.design.factory.abstactfactory;

import com.demo.design.factory.Operation;
import com.demo.design.factory.Space;

public interface OpeAbstactFactory {

	Operation createOperation();
	
	Space createSpace();
	
}