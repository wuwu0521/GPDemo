
/**  
* @Title: proxy.java  
* @Package com.demo.proxy.simpleproxy  
* @Description: TODO(��һ�仰�������ļ���ʲô)  
* @author Administrator  
* @date 2019��4��19��  
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
		System.out.println("��������֮ǰ");
	}
	
	private void after() {
		System.out.println("��������֮��");
	}

	
}
