
/**  
* @Title: TestCGlibProxy.java  
* @Package com.demo.proxy  
* @Description: TODO(��һ�仰�������ļ���ʲô)  
* @author Administrator  
* @date 2019��4��21��  
* @version V1.0  
*/
package com.demo.proxy;

import com.demo.proxy.cglibproxy.CGlibCustomer;
import com.demo.proxy.cglibproxy.CGlibMepio;

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
