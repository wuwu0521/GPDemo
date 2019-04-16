
/**  
* @Title: EnumSingleton.java  
* @Package com.demo.singleton.register  
* @Description: TODO(��һ�仰�������ļ���ʲô)  
* @author Administrator  
* @date 2019��4��16��  
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
