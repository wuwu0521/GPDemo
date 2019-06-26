
/**  
* @Title: OrderDynamicProxy.java  
* @Package com.demo.proxy.dbrouteproxy.proxy  
* @Description: TODO(用一句话描述该文件做什么)  
* @author Administrator  
* @date 2019年4月20日  
* @version V1.0  
*/
package com.demo.design.proxy.dbrouteproxy.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.demo.design.proxy.dbrouteproxy.dataSource.DynamicDataSourceEntity;

public class OrderDynamicProxy implements InvocationHandler{
    private SimpleDateFormat yearFormat = new SimpleDateFormat("yyyy");

	private Object obj;
	
	public Object getInstance(Object obj){
		this.obj = obj;
		Class<?> clazz = obj.getClass();
		return Proxy.newProxyInstance(clazz.getClassLoader(), clazz.getInterfaces(), this);
		
	}
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		before(args[0]);
		Object object = method.invoke(obj, args);
		after();
		return object;
	}

	
	
	private void after() {
		System.out.println("调用之后");
		DynamicDataSourceEntity.restore();
	}

	private void before(Object target) {
		System.out.println("调用之前");
		try {
			Long time = (Long) target.getClass().getMethod("getCreateTime").invoke(target);
			Integer a = Integer.valueOf(yearFormat.format(new Date(time)));
			DynamicDataSourceEntity.set(a);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
