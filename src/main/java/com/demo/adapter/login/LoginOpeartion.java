
/**  
* @Title: LoginAdapter.java  
* @Package com.demo.adapter.login  
* @Description: TODO(��һ�仰�������ļ���ʲô)  
* @author Administrator  
* @date 2019��4��30��  
* @version V1.0  
*/
package com.demo.adapter.login;

public interface LoginOpeartion {

	boolean support(Object adapter);
	
	Result<Object> login(String id,Object adapter);
}
