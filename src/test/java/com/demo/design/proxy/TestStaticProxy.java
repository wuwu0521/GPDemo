
/**  
* @Title: TestStaticProxy.java  
* @Package com.demo.proxy  
* @Description: TODO(��һ�仰�������ļ���ʲô)  
* @author Administrator  
* @date 2019��4��19��  
* @version V1.0  
*/
package com.demo.design.proxy;

import com.demo.design.proxy.staticproxy.Father;
import com.demo.design.proxy.staticproxy.Son;

public class TestStaticProxy {

	
	public static void main(String[] args) {
		Father father = new Father(new Son());
		father.findLove();
	}
}
