
/**  
* @Title: GPMeipo.java  
* @Package com.demo.proxy.gpproxy  
* @Description: TODO(用一句话描述该文件做什么)  
* @author Administrator  
* @date 2019年4月19日  
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
		System.out.println("调用之前");
	}

	private void before() {
		System.out.println("调用之后");
	}
}
