
/**  
* @Title: CGlibMepio.java  
* @Package com.demo.proxy.cglibproxy  
* @Description: TODO(用一句话描述该文件做什么)  
* @author Administrator  
* @date 2019年4月21日  
* @version V1.0  
*/
package com.demo.design.proxy.cglibproxy;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

public class CGlibMepio implements MethodInterceptor {

	public Object getInstance(Class<?> clazz) throws Exception{
		Enhancer enhancer = new Enhancer();
		enhancer.setSuperclass(clazz);
		enhancer.setCallback(this);
		return enhancer.create();
	}
	
	
	@Override
	public Object intercept(Object obj, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
		before();
		Object object = methodProxy.invokeSuper(obj,objects);
		after();
		return object;
	}

	private void after() {
		System.out.println("调用之后");
	}

	private void before() {
		System.out.println("调用之前");
	}

	
	
}
