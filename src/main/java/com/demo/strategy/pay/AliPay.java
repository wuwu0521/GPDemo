
/**  
* @Title: AliPay.java  
* @Package com.demo.strategy.pay  
* @Description: TODO(用一句话描述该文件做什么)  
* @author Administrator  
* @date 2019年4月23日  
* @version V1.0  
*/
package com.demo.strategy.pay;

public class AliPay extends Payment{

	
	@Override
	public String getPayName() {
		return "支付宝支付";
	}
	
	@Override
	public double getBalance(String id) {
		return 200d;
	}
}
