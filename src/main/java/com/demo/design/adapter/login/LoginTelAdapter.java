
/**  
* @Title: LoginTelAdapter.java  
* @Package com.demo.adapter.login  
* @Description: TODO(用一句话描述该文件做什么)  
* @author Administrator  
* @date 2019年4月30日  
* @version V1.0  
*/
package com.demo.design.adapter.login;

public class LoginTelAdapter implements LoginOpeartion{

	@Override
	public boolean support(Object adapter) {
		return false;
	}

	
	@Override
	public Result<Object> login(String id, Object adapter) {
		return null;
	}

}
