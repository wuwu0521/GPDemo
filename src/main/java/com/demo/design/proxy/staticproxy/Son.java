
/**  
* @Title: Son.java  
* @Package com.demo.proxy.staticproxy  
* @Description: TODO(��һ�仰�������ļ���ʲô)  
* @author Administrator  
* @date 2019��4��19��  
* @version V1.0  
*/
package com.demo.design.proxy.staticproxy;

import com.demo.design.proxy.Person;

public class Son implements Person{
	
	@Override
	public void findLove() {
		System.out.println("I want girl");
	}
}
