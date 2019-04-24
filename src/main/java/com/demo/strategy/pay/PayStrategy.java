
/**  
* @Title: PayStrategy.java  
* @Package com.demo.strategy.pay  
* @Description: TODO(用一句话描述该文件做什么)  
* @author Administrator  
* @date 2019年4月23日  
* @version V1.0  
*/
package com.demo.strategy.pay;

import java.util.HashMap;
import java.util.Map;

public class PayStrategy {

	public static final String ALI_PAY = "aliPay";

	public static final String JD_PAY = "JDPay";

	public static final String WECHAT_PAY = "wechatPay";
	
	public static final String DEFAULT_PAY = ALI_PAY;

	private static Map<String,Payment> payStrategy = new HashMap<String,Payment>();
	
	static {
		payStrategy.put(ALI_PAY, new AliPay());
		payStrategy.put(JD_PAY, new JDPay());
		payStrategy.put(WECHAT_PAY, new WechatPay());
	}
	private PayStrategy() {
	}

	public static Payment getInstance(String paykey){
		if(!payStrategy.containsKey(paykey)){
			return payStrategy.get(DEFAULT_PAY);
		}
		return payStrategy.get(paykey);
	}
}
