
/**  
* @Title: AliPay.java  
* @Package com.demo.strategy.pay  
* @Description: TODO(��һ�仰�������ļ���ʲô)  
* @author Administrator  
* @date 2019��4��23��  
* @version V1.0  
*/
package com.demo.strategy.pay;

public class AliPay extends Payment{

	
	@Override
	public String getPayName() {
		return "֧����֧��";
	}
	
	@Override
	public double getBalance(String id) {
		return 200d;
	}
}
