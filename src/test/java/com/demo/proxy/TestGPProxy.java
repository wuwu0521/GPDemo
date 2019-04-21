
/**  
* @Title: TestGPProxy.java  
* @Package com.demo.proxy  
* @Description: TODO(用一句话描述该文件做什么)  
* @author Administrator  
* @date 2019年4月20日  
* @version V1.0  
*/
package com.demo.proxy;

import com.demo.proxy.gpproxy.GPMeipo;
import com.demo.proxy.jdkproxy.Gril;

public class TestGPProxy {

	public static void main(String[] args) {
		Person person = (Person) new GPMeipo().getInstance(new Gril());
		person.findLove();
	}
}
