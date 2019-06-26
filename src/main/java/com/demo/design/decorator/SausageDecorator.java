
/**  
* @Title: SausageDecorator.java  
* @Package com.demo.decorator  
* @Description: TODO(��һ�仰�������ļ���ʲô)  
* @author Administrator  
* @date 2019��5��1��  
* @version V1.0  
*/
package com.demo.design.decorator;

public class SausageDecorator extends BattercakeDecorator{

	public SausageDecorator(Battercake battercake) {
		super(battercake);
	}

	@Override
	protected void doSomething() {
		
	}

	@Override
	protected String getMsg() {
		return super.getMsg()+"��һ���㳦";
	}

	@Override
	protected int getPrice() {
		return super.getPrice()+1;
	}

	
}
