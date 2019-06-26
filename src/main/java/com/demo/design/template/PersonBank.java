
/**  
* @Title: PersonAbank.java  
* @Package com.demo.template  
* @Description: TODO(��һ�仰�������ļ���ʲô)  
* @author Administrator  
* @date 2019��4��28��  
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
		System.out.println("����ҵ��");
	}

	@Override
	protected void saveMoney() {
		System.out.println("ȡǮ");
	}

	@Override
	protected boolean needSaveMoney() {
		return this.needSaveMoney;
	}
	
}
