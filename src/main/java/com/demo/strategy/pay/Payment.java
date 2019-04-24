
/**  
* @Title: Payment.java  
* @Package com.demo.strategy.pay  
* @Description: TODO(用一句话描述该文件做什么)  
* @author Administrator  
* @date 2019年4月23日  
* @version V1.0  
*/
package com.demo.strategy.pay;

public abstract class Payment {

	public abstract String getPayName();
	
	public abstract double getBalance(String id);
	
	public Result toPay(String id, double amount) {
		if (getBalance(id) < amount) {
			return new Result(500, "支付失败", "余额不足");
		}
		return new Result(200,"支付成功","支付金额："+amount);
	}
	
}
