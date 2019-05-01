
/**  
* @Title: BankTemplate.java  
* @Package com.demo.template  
* @Description: TODO(用一句话描述该文件做什么)  
* @author Administrator  
* @date 2019年4月28日  
* @version V1.0  
*/
package com.demo.template;

public abstract class BankTemplate {

	public final void process(){
		//排队区号
		this.getNum();
		//办理业务
		exeTask();
		//进行评价
		evaluate();
		
		if(needSaveMoney()){
			saveMoney();
		}
	}
	protected abstract void saveMoney();

	protected boolean needSaveMoney() {
		return false;
	}

	private void evaluate(){
		System.out.println("进行评分");
	};

	protected abstract void exeTask();
	
	private void getNum() {
		System.out.println("排队取号");
	}
}
