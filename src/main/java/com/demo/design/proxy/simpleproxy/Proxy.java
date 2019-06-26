
/**  
* @Title: proxy.java  
* @Package com.demo.proxy.simpleproxy  
* @Description: TODO(用一句话描述该文件做什么)  
* @author Administrator  
* @date 2019年4月19日  
* @version V1.0  
*/
package com.demo.design.proxy.simpleproxy;

public class Proxy implements Subject{

	private Subject subject;
	
	public Proxy(Subject subject){
		this.subject = subject;
	}
	@Override
	public void request() {
		before();
		subject.request();
		after();
	}
	
	private void before() {
		System.out.println("发送请求之前");
	}
	
	private void after() {
		System.out.println("发送请求之后");
	}

	
}
