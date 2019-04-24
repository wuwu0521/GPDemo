
/**  
* @Title: Payment.java  
* @Package com.demo.strategy.pay  
* @Description: TODO(��һ�仰�������ļ���ʲô)  
* @author Administrator  
* @date 2019��4��23��  
* @version V1.0  
*/
package com.demo.strategy.pay;

public abstract class Payment {

	public abstract String getPayName();
	
	public abstract double getBalance(String id);
	
	public Result toPay(String id, double amount) {
		if (getBalance(id) < amount) {
			return new Result(500, "֧��ʧ��", "����");
		}
		return new Result(200,"֧���ɹ�","֧����"+amount);
	}
	
}
