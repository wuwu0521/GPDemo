
/**  
* @Title: JDPay.java  
* @Package com.demo.strategy.pay  
* @Description: TODO(用一句话描述该文件做什么)  
* @author Administrator  
* @date 2019年4月23日  
* @version V1.0  
*/
package com.demo.design.strategy.pay;

public class JDPay extends Payment{

	
	@Override
	public String getPayName() {
		return "京东支付";
	}

	@Override
	public double getBalance(String id) {
		return 100d;
	}

}
