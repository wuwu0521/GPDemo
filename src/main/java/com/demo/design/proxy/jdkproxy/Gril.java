
/**  
* @Title: Gril.java  
* @Package com.demo.proxy.jdkproxy  
* @Description: TODO(用一句话描述该文件做什么)  
* @author Administrator  
* @date 2019年4月19日  
* @version V1.0  
*/
package com.demo.design.proxy.jdkproxy;

import com.demo.design.proxy.Person;

public class Gril implements Person{
	public void findLove(){
		System.out.println("有钱");
		System.out.println("有车");
		System.out.println("有房");
	}
}
