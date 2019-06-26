
/**  
* @Title: Father.java  
* @Package com.demo.proxy.staticproxy  
* @Description: TODO(��һ�仰�������ļ���ʲô)  
* @author Administrator  
* @date 2019��4��19��  
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
		System.out.println("�������");
	}

	private void before() {
		System.out.println("��ʼѰ����Դ");
	}
}
