
/**  
* @Title: GPInvocationHandler.java  
* @Package com.demo.proxy.gpproxy  
* @Description: TODO(��һ�仰�������ļ���ʲô)  
* @author Administrator  
* @date 2019��4��19��  
* @version V1.0  
*/
package com.demo.design.proxy.gpproxy;

import java.lang.reflect.Method;

public interface GPInvocationHandler {
	 public Object invoke(Object proxy, Method method, Object[] args)
	            throws Throwable;
}
