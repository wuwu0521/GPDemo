
/**  
* @Title: LoginTelAdapter.java  
* @Package com.demo.adapter.login  
* @Description: TODO(��һ�仰�������ļ���ʲô)  
* @author Administrator  
* @date 2019��4��30��  
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
