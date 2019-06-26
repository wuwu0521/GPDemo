
/**  
* @Title: TestPayStrategy.java  
* @Package com.demo.delegate  
* @Description: TODO(用一句话描述该文件做什么)  
* @author Administrator  
* @date 2019年4月23日  
* @version V1.0  
*/
package com.demo.design.strategy;

import com.demo.design.strategy.pay.PayStrategy;
import com.demo.design.strategy.pay.Payment;

public class TestPayStrategy {

	public static void main(String[] args) {
		Payment payment = PayStrategy.getInstance(PayStrategy.ALI_PAY);
		System.out.println("欢迎使用" + payment.getPayName());
		System.out.println("余额为"+payment.getBalance("1111"));
		System.out.println(payment.toPay("1111", 30d));
		
	}
}
