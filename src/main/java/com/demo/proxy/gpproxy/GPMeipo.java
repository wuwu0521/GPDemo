
/**  
* @Title: GPMeipo.java  
* @Package com.demo.proxy.gpproxy  
* @Description: TODO(��һ�仰�������ļ���ʲô)  
* @author Administrator  
* @date 2019��4��19��  
* @version V1.0  
*/
package com.demo.proxy.gpproxy;

import java.lang.reflect.Method;

public class GPMeipo implements GPInvocationHandler{
	private Object obj;
	
	public Object getInstance(Object obj){
		this.obj = obj;
		Class<?> clazz = obj.getClass();
		return GPProxy.newProxyInstance(new GPClassLoader(), clazz.getInterfaces(), this);
	}
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		before();
		Object target = method.invoke(this.obj, args);
		after();
		return null;
	}

	private void after() {
		System.out.println("����֮ǰ");
	}

	private void before() {
		System.out.println("����֮��");
	}
}
