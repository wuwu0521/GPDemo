
/**  
* @Title: BattercakeDecorator.java  
* @Package com.demo.decorator  
* @Description: TODO(��һ�仰�������ļ���ʲô)  
* @author Administrator  
* @date 2019��5��1��  
* @version V1.0  
*/
package com.demo.design.decorator;

public abstract class BattercakeDecorator extends Battercake{

	private Battercake battercake;
	
	public BattercakeDecorator(Battercake battercake) {
		this.battercake = battercake;
	}

	protected abstract void doSomething();
	
	@Override
	protected String getMsg() {
		return this.battercake.getMsg();
	}

	@Override
	protected int getPrice() {
		return this.battercake.getPrice();
	}

	
}
