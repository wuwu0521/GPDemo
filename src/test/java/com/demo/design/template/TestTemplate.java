
/**  
* @Title: TestTemplate.java  
* @Package com.demo.template  
* @Description: TODO(��һ�仰�������ļ���ʲô)  
* @author Administrator  
* @date 2019��4��28��  
* @version V1.0  
*/
package com.demo.design.template;

public class TestTemplate {

	public static void main(String[] args) {
		BankTemplate bank = new PersonBank(false);
		bank.process();
	}
}
