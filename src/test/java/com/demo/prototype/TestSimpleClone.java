
/**  
* @Title: TestSimplePrototype.java  
* @Package com.demo.prototype  
* @Description: TODO(用一句话描述该文件做什么)  
* @author Administrator  
* @date 2019年4月16日  
* @version V1.0  
*/
package com.demo.prototype;

import com.demo.prototype.simple.Client;
import com.demo.prototype.simple.UserPrototype;

public class TestSimpleClone {

	public static void main(String[] args) {

		UserPrototype user = new UserPrototype();
		user.setUserName("prototype");
		user.setAge(18);
		System.out.println(user);
		
		Client client = new Client(user);
		UserPrototype userClone = (UserPrototype) client.startClone(user);
		System.out.println(userClone);

		System.out.println("对象地址比较：" + (userClone.getUserName() == user.getUserName()));
	}
}
