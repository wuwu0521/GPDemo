
/**  
* @Title: GPInvocationHandler.java  
* @Package com.demo.proxy.gpproxy  
* @Description: TODO(用一句话描述该文件做什么)  
* @author Administrator  
* @date 2019年4月19日  
* @version V1.0  
*/
package com.demo.design.proxy.gpproxy;

import java.lang.reflect.Method;

public interface GPInvocationHandler {
	 public Object invoke(Object proxy, Method method, Object[] args)
	            throws Throwable;
}
