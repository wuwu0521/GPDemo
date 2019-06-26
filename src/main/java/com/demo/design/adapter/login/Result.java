
/**  
* @Title: Result.java  
* @Package com.demo.adapter.login  
* @Description: TODO(用一句话描述该文件做什么)  
* @author Administrator  
* @date 2019年4月30日  
* @version V1.0  
*/
package com.demo.design.adapter.login;

public class Result<T> {

	private String msg;

	private String code;

	private boolean sucess;

	private T data;

	public Result(String msg, String code, boolean sucess, T data) {
		super();
		this.msg = msg;
		this.code = code;
		this.sucess = sucess;
		this.data = data;
	}
	
	public Result() {
		this.sucess = true;
		this.code="200";
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public boolean isSucess() {
		return sucess;
	}

	public void setSucess(boolean sucess) {
		this.sucess = sucess;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
}
