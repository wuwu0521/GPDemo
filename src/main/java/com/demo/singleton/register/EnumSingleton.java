
/**  
* @Title: EnumSingleton.java  
* @Package com.demo.singleton.register  
* @Description: TODO(用一句话描述该文件做什么)  
* @author Administrator  
* @date 2019年4月16日  
* @version V1.0  
*/
package com.demo.singleton.register;

public enum EnumSingleton {
	INSTANCE;

	public Object data;

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public static EnumSingleton getInstance() {
		return INSTANCE;
	}

}
