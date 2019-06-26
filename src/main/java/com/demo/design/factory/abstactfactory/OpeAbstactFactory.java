
/**  
* @Title: OpeAbstactFactory.java  
* @Package com.demo.factory.abstactfactory  
* @Description: TODO(用一句话描述该文件做什么)  
* @author Administrator  
* @date 2019年4月15日  
* @version V1.0  
*/
package com.demo.design.factory.abstactfactory;

import com.demo.design.factory.Operation;
import com.demo.design.factory.Space;

public interface OpeAbstactFactory {

	Operation createOperation();
	
	Space createSpace();
	
}
