
/**  
* @Title: RealSubject.java  
* @Package com.demo.proxy.simpleproxy  
* @Description: TODO(��һ�仰�������ļ���ʲô)  
* @author Administrator  
* @date 2019��4��19��  
* @version V1.0  
*/
package com.demo.design.proxy.simpleproxy;

public class RealSubject implements Subject{

	@Override
	public void request() {
		 System.out.println("����������");
	}
}
