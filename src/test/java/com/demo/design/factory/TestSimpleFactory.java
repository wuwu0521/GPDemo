
/**  
* @Title: TestFactory.java  
* @Package com.demo.factory  
* @Description: TODO(��һ�仰�������ļ���ʲô)  
* @author Administrator  
* @date 2019��4��15��  
* @version V1.0  
*/
package com.demo.design.factory;

import com.demo.design.factory.simplefactoy.SimpleFactory;

public class TestSimpleFactory {

	public static void main(String[] args) {
		Operation add = SimpleFactory.createOperation(Addition.class);
        Operation sub = SimpleFactory.createOperation(Subtraction.class);
        Operation mul = SimpleFactory.createOperation(Multiplication.class);
        try {
			System.out.println(add.getResult(1, 1));
			System.out.println(sub.getResult(1, 1));
			System.out.println(mul.getResult(1, 1));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
