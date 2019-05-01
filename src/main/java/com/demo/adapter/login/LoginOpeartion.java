
/**  
* @Title: LoginAdapter.java  
* @Package com.demo.adapter.login  
* @Description: TODO(用一句话描述该文件做什么)  
* @author Administrator  
* @date 2019年4月30日  
* @version V1.0  
*/
package com.demo.adapter.login;

public interface LoginOpeartion {

	boolean support(Object adapter);
	
	Result<Object> login(String id,Object adapter);
}
