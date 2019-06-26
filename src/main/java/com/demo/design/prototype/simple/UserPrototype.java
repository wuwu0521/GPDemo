
/**  
* @Title: UserPrototype.java  
* @Package com.demo.prototype.simple  
* @Description: TODO(��һ�仰�������ļ���ʲô)  
* @author Administrator  
* @date 2019��4��16��  
* @version V1.0  
*/
package com.demo.design.prototype.simple;

public class UserPrototype implements Prototype {

	private String userName;

	private Integer age;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	@Override
	public UserPrototype clone() {
		UserPrototype concretePrototype = new UserPrototype();
		concretePrototype.setUserName(this.userName);
		concretePrototype.setAge(this.age);
		return concretePrototype;
	}
}
