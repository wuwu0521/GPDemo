
/**  
* @Title: PersonAbank.java  
* @Package com.demo.template  
* @Description: TODO(用一句话描述该文件做什么)  
* @author Administrator  
* @date 2019年4月28日  
* @version V1.0  
*/
package com.demo.design.template;

public class PersonBank extends BankTemplate{
	
	private boolean needSaveMoney =false;
	
	public PersonBank(boolean needSaveMoney){
		this.needSaveMoney = needSaveMoney;
	}
	
	@Override
	protected void exeTask() {
		System.out.println("办理业务");
	}

	@Override
	protected void saveMoney() {
		System.out.println("取钱");
	}

	@Override
	protected boolean needSaveMoney() {
		return this.needSaveMoney;
	}
	
}
