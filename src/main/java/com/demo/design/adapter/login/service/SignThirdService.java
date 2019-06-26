
/**  
* @Title: SignThirdService.java  
* @Package com.demo.adapter.login.service  
* @Description: TODO(用一句话描述该文件做什么)  
* @author Administrator  
* @date 2019年5月1日  
* @version V1.0  
*/
package com.demo.design.adapter.login.service;

import com.demo.design.adapter.login.Result;

public class SignThirdService extends SignService{

	public Result<Object> loginForQQ(String openId){
        return loginForRegist(openId,null);
    }

    public Result<Object> loginForWechat(String openId){
        return null;
    }

    public Result<Object> loginForToken(String token){
        return  null;
    }

    public Result<Object> loginForTelphone(String telphone,String code){
        return null;
    }

    public Result<Object> loginForRegist(String username,String password){
        super.regist(username,null);
        return super.login(username,null);
    }
}
