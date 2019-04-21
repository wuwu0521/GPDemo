
/**  
* @Title: TestStaticProxy.java  
* @Package com.demo.proxy  
* @Description: TODO(用一句话描述该文件做什么)  
* @author Administrator  
* @date 2019年4月19日  
* @version V1.0  
*/
package com.demo.proxy;

import com.demo.proxy.staticproxy.Father;
import com.demo.proxy.staticproxy.Son;

public class TestStaticProxy {

	
	public static void main(String[] args) {
		Father father = new Father(new Son());
		father.findLove();
	}
}
