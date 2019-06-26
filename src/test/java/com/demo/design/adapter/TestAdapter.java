
/**  
* @Title: TestAdapter.java  
* @Package com.demo.adapter  
* @Description: TODO(��һ�仰�������ļ���ʲô)  
* @author Administrator  
* @date 2019��5��1��  
* @version V1.0  
*/
package com.demo.design.adapter;

import com.alibaba.fastjson.JSONObject;
import com.demo.design.adapter.login.PassportAdapter;
import com.demo.design.adapter.login.Result;

public class TestAdapter {

	public static void main(String[] args) {
		PassportAdapter adapter = new PassportAdapter();
		Result<Object> result = adapter.loginQQ("123");
		System.out.println(JSONObject.toJSON(result));
	}
}
