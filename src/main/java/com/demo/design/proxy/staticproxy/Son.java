
/**  
* @Title: Son.java  
* @Package com.demo.proxy.staticproxy  
* @Description: TODO(用一句话描述该文件做什么)  
* @author Administrator  
* @date 2019年4月19日  
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
