
/**  
* @Title: Result.java  
* @Package com.demo.strategy.pay  
* @Description: TODO(��һ�仰�������ļ���ʲô)  
* @author Administrator  
* @date 2019��4��23��  
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
        return ("֧��״̬��[" + code + "]," + msg + ",�������飺" + data);
    }
}
