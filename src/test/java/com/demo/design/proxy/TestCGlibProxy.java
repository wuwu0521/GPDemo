
/**  
* @Title: TestCGlibProxy.java  
* @Package com.demo.proxy  
* @Description: TODO(用一句话描述该文件做什么)  
* @author Administrator  
* @date 2019年4月21日  
* @version V1.0  
*/
package com.demo.design.proxy;

import com.demo.design.proxy.cglibproxy.CGlibCustomer;
import com.demo.design.proxy.cglibproxy.CGlibMepio;

public class TestCGlibProxy {

	public static void main(String[] args) {
		try {
			CGlibMepio cglib = new CGlibMepio();
			CGlibCustomer customer = (CGlibCustomer)cglib.getInstance(CGlibCustomer.class);
			customer.findLove();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
