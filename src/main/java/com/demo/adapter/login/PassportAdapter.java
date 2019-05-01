
/**  
* @Title: PassportAdapter.java  
* @Package com.demo.adapter.login  
* @Description: TODO(��һ�仰�������ļ���ʲô)  
* @author Administrator  
* @date 2019��5��1��  
* @version V1.0  
*/
package com.demo.adapter.login;

import com.alibaba.fastjson.JSONObject;
import com.demo.adapter.login.service.SignService;

public class PassportAdapter extends SignService implements PassportOpeartion {

	private final static LoginQQAdapter loginQQAdapter;

	private final static LoginTelAdapter loginTelAdapter;

	private final static LoginWechatAdapter loginWechatAdapter;
	// ��̬������������ʱ���ã�����ֻ����һ��
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
