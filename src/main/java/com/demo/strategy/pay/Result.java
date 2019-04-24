
/**  
* @Title: Result.java  
* @Package com.demo.strategy.pay  
* @Description: TODO(用一句话描述该文件做什么)  
* @author Administrator  
* @date 2019年4月23日  
* @version V1.0  
*/
package com.demo.strategy.pay;

public class Result {

	private int code;
	private String msg;
	private Object data;

	public Result(int code,String msg,Object data) {
		this.code = code;
		this.msg = msg;
		this.data = data;
	}
	
	public String toString(){
        return ("支付状态：[" + code + "]," + msg + ",交易详情：" + data);
    }
}
