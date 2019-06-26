
/**  
* @Title: TestAbstactFactory.java  
* @Package com.demo.factory  
* @Description: TODO(��һ�仰�������ļ���ʲô)  
* @author Administrator  
* @date 2019��4��15��  
* @version V1.0  
*/
package com.demo.design.factory;

import com.demo.design.factory.abstactfactory.AddAbstactFactory;
import com.demo.design.factory.abstactfactory.OpeAbstactFactory;

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
