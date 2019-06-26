
/**  
* @Title: Father.java  
* @Package com.demo.proxy.staticproxy  
* @Description: TODO(用一句话描述该文件做什么)  
* @author Administrator  
* @date 2019年4月19日  
* @version V1.0  
*/
package com.demo.design.proxy.staticproxy;

import com.demo.design.proxy.Person;

public class Father implements Person{

	private Son son;
	
	public Father(Son son) {
		this.son = son;
	}

	@Override
	public void findLove() {
		before();
		this.son.findLove();
		after();
	}

	private void after() {
		System.out.println("相见恨晚");
	}

	private void before() {
		System.out.println("开始寻找资源");
	}
}
