
/**  
* @Title: TestDecorator.java  
* @Package com.demo.decorator  
* @Description: TODO(用一句话描述该文件做什么)  
* @author Administrator  
* @date 2019年5月1日  
* @version V1.0  
*/
package com.demo.decorator;

public class TestDecorator {

	public static void main(String[] args) {

		Battercake cake = new BaseBattercake();
		cake = new BaseBattercake();
		cake = new EggDecorator(cake);
		cake = new EggDecorator(cake);
		cake = new BaseBattercakeDecorator(cake);
		System.out.println("购买商品为：" + cake.getMsg() + "\n总价格为：" + cake.getPrice());
	}
}
	