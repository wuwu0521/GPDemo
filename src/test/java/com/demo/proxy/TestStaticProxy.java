
/**  
* @Title: TestStaticProxy.java  
* @Package com.demo.proxy  
* @Description: TODO(��һ�仰�������ļ���ʲô)  
* @author Administrator  
* @date 2019��4��19��  
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
