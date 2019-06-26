
/**  
* @Title: RealSubject.java  
* @Package com.demo.proxy.simpleproxy  
* @Description: TODO(用一句话描述该文件做什么)  
* @author Administrator  
* @date 2019年4月19日  
* @version V1.0  
*/
package com.demo.design.proxy.simpleproxy;

public class RealSubject implements Subject{

	@Override
	public void request() {
		 System.out.println("调用请求中");
	}
}
