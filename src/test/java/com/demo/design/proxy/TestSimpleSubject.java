
/**  
* @Title: TestSimpleSubject.java  
* @Package com.demo.proxy  
* @Description: TODO(��һ�仰�������ļ���ʲô)  
* @author Administrator  
* @date 2019��4��19��  
* @version V1.0  
*/
package com.demo.design.proxy;

import com.demo.design.proxy.simpleproxy.Proxy;
import com.demo.design.proxy.simpleproxy.RealSubject;

public class TestSimpleSubject {

	public static void main(String[] args) {
		Proxy proxy = new Proxy(new RealSubject());
		proxy.request();
	}
}
