
/**  
* @Title: SausageDecorator.java  
* @Package com.demo.decorator  
* @Description: TODO(用一句话描述该文件做什么)  
* @author Administrator  
* @date 2019年5月1日  
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
		return super.getMsg()+"加一个香肠";
	}

	@Override
	protected int getPrice() {
		return super.getPrice()+1;
	}

	
}
