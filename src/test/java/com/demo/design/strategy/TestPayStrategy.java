
/**  
* @Title: TestPayStrategy.java  
* @Package com.demo.delegate  
* @Description: TODO(��һ�仰�������ļ���ʲô)  
* @author Administrator  
* @date 2019��4��23��  
* @version V1.0  
*/
package com.demo.design.strategy;

import com.demo.design.strategy.pay.PayStrategy;
import com.demo.design.strategy.pay.Payment;

public class TestPayStrategy {

	public static void main(String[] args) {
		Payment payment = PayStrategy.getInstance(PayStrategy.ALI_PAY);
		System.out.println("��ӭʹ��" + payment.getPayName());
		System.out.println("���Ϊ"+payment.getBalance("1111"));
		System.out.println(payment.toPay("1111", 30d));
		
	}
}
