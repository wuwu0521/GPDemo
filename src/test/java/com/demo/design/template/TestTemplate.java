
/**  
* @Title: TestTemplate.java  
* @Package com.demo.template  
* @Description: TODO(用一句话描述该文件做什么)  
* @author Administrator  
* @date 2019年4月28日  
* @version V1.0  
*/
package com.demo.design.template;

public class TestTemplate {

	public static void main(String[] args) {
		BankTemplate bank = new PersonBank(false);
		bank.process();
	}
}
