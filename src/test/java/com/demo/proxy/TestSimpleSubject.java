
/**  
* @Title: TestSimpleSubject.java  
* @Package com.demo.proxy  
* @Description: TODO(用一句话描述该文件做什么)  
* @author Administrator  
* @date 2019年4月19日  
* @version V1.0  
*/
package com.demo.proxy;

import com.demo.proxy.simpleproxy.Proxy;
import com.demo.proxy.simpleproxy.RealSubject;

public class TestSimpleSubject {

	public static void main(String[] args) {
		Proxy proxy = new Proxy(new RealSubject());
		proxy.request();
	}
}
