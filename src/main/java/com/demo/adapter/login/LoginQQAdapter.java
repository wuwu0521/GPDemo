
/**  
* @Title: LoginQQAdapter.java  
* @Package com.demo.adapter.login  
* @Description: TODO(用一句话描述该文件做什么)  
* @author Administrator  
* @date 2019年4月30日  
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
		result.setMsg("调用失败");
		result.setSucess(false);
		result.setCode("400");
		return result;
	}

}
