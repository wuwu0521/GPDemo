
/**  
* @Title: TestAbstactFactory.java  
* @Package com.demo.factory  
* @Description: TODO(用一句话描述该文件做什么)  
* @author Administrator  
* @date 2019年4月15日  
* @version V1.0  
*/
package com.demo.factory;

import com.demo.factory.abstactfactory.AddAbstactFactory;
import com.demo.factory.abstactfactory.OpeAbstactFactory;

public class TestAbstactFactory {

	public static void main(String[] args) {
		OpeAbstactFactory factory = new AddAbstactFactory();
		try {
			double a = factory.createOperation().getResult(1, 2);
			factory.createSpace().createCoordinate();
			System.out.println(a);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
