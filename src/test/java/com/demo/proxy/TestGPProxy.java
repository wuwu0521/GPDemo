
/**  
* @Title: TestGPProxy.java  
* @Package com.demo.proxy  
* @Description: TODO(��һ�仰�������ļ���ʲô)  
* @author Administrator  
* @date 2019��4��20��  
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
