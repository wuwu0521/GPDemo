
/**  
* @Title: LoginQQAdapter.java  
* @Package com.demo.adapter.login  
* @Description: TODO(��һ�仰�������ļ���ʲô)  
* @author Administrator  
* @date 2019��4��30��  
* @version V1.0  
*/
package com.demo.adapter.login;

public class LoginQQAdapter implements LoginOpeartion{

	@Override
	public boolean support(Object adapter) {
		return adapter instanceof LoginQQAdapter;
	}
	
	@Override
	public Result<Object> login(String id, Object adapter) {
		Result<Object> result= new Result<Object>();
		result.setMsg("����ʧ��");
		result.setSucess(false);
		result.setCode("400");
		return result;
	}

}
