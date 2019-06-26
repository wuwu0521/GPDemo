
/**  
* @Title: JDKMeipo.java  
* @Package com.demo.proxy.jdkproxy  
* @Description: TODO(��һ�仰�������ļ���ʲô)  
* @author Administrator  
* @date 2019��4��19��  
* @version V1.0  
*/
package com.demo.design.proxy.jdkproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class JDKMeipo implements InvocationHandler{

	private Object target;
	
	public Object getInstance(Object target){
		this.target = target;
		Class<?> clazz = target.getClass();
		return Proxy.newProxyInstance(clazz.getClassLoader(), clazz.getInterfaces(), this);
	}
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		before();
		Object obj = method.invoke(this.target, args);
		after();
		return obj;
	}

	private void after() {
		System.out.println("����֮��");
	}

	private void before() {
		System.out.println("����֮ǰ");
	}

}
