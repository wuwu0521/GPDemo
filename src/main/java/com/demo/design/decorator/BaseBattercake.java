
/**  
* @Title: BaseBattercake.java  
* @Package com.demo.decorator  
* @Description: TODO(��һ�仰�������ļ���ʲô)  
* @author Administrator  
* @date 2019��5��1��  
* @version V1.0  
*/
package com.demo.design.decorator;

public class BaseBattercake extends Battercake{


	@Override
	protected String getMsg() {
		return "һ�����";
	}

	@Override
	protected int getPrice() {
		return 5;
	}

}
