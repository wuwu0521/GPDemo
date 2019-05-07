
/**  
* @Title: TestDecorator.java  
* @Package com.demo.decorator  
* @Description: TODO(��һ�仰�������ļ���ʲô)  
* @author Administrator  
* @date 2019��5��1��  
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
		System.out.println("������ƷΪ��" + cake.getMsg() + "\n�ܼ۸�Ϊ��" + cake.getPrice());
	}
}
	