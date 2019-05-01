
/**  
* @Title: BankTemplate.java  
* @Package com.demo.template  
* @Description: TODO(��һ�仰�������ļ���ʲô)  
* @author Administrator  
* @date 2019��4��28��  
* @version V1.0  
*/
package com.demo.template;

public abstract class BankTemplate {

	public final void process(){
		//�Ŷ�����
		this.getNum();
		//����ҵ��
		exeTask();
		//��������
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
		System.out.println("��������");
	};

	protected abstract void exeTask();
	
	private void getNum() {
		System.out.println("�Ŷ�ȡ��");
	}
}
