package com.demo.design.adapter.login;

public interface PassportOpeartion {
	
	Result<Object> loginQQ(String id);

	Result<Object> loginWechat(String id);

	Result<Object> loginTel(String telphone);
}
