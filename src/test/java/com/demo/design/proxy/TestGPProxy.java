
/**  
* @Title: TestGPProxy.java  
* @Package com.demo.proxy  
* @Description: TODO(��һ�仰�������ļ���ʲô)  
* @author Administrator  
* @date 2019��4��20��  
* @version V1.0  
*/
package com.demo.design.proxy;

import com.demo.design.proxy.gpproxy.GPMeipo;
import com.demo.design.proxy.jdkproxy.Gril;

public class TestGPProxy {

	public static void main(String[] args) {
		Person person = (Person) new GPMeipo().getInstance(new Gril());
		person.findLove();
	}
}
