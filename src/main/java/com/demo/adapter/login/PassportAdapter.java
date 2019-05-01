
/**  
* @Title: PassportAdapter.java  
* @Package com.demo.adapter.login  
* @Description: TODO(用一句话描述该文件做什么)  
* @author Administrator  
* @date 2019年5月1日  
* @version V1.0  
*/
package com.demo.adapter.login;

import com.alibaba.fastjson.JSONObject;
import com.demo.adapter.login.service.SignService;

public class PassportAdapter extends SignService implements PassportOpeartion {

	private final static LoginQQAdapter loginQQAdapter;

	private final static LoginTelAdapter loginTelAdapter;

	private final static LoginWechatAdapter loginWechatAdapter;
	// 静态代码块在类加载时调用，并且只调用一次
	static {
		loginQQAdapter = new LoginQQAdapter();
		loginTelAdapter = new LoginTelAdapter();
		loginWechatAdapter = new LoginWechatAdapter();
	}
	
	public PassportAdapter() {
	};

	@Override
	public Result<Object> loginQQ(String id) {
		System.out.println(loginQQAdapter);
		return processLogin(id, loginQQAdapter.getClass());
	}

	@Override
	public Result<Object> loginWechat(String id) {
		return processLogin(id, loginWechatAdapter.getClass());
	}

	@Override
	public Result<Object> loginTel(String telphone) {
		return processLogin(telphone, loginTelAdapter.getClass());
	}

	private Result<Object> processLogin(String key, Class<? extends LoginOpeartion> clazz, String... str) {
		try {
			LoginOpeartion adapter = clazz.newInstance();
			if (adapter.support(adapter)) {
				return adapter.login(key, adapter);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
