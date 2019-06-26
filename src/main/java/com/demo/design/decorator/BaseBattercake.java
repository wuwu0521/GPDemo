
/**  
* @Title: BaseBattercake.java  
* @Package com.demo.decorator  
* @Description: TODO(用一句话描述该文件做什么)  
* @author Administrator  
* @date 2019年5月1日  
* @version V1.0  
*/
package com.demo.design.decorator;

public class BaseBattercake extends Battercake{


	@Override
	protected String getMsg() {
		return "一个煎饼";
	}

	@Override
	protected int getPrice() {
		return 5;
	}

}
