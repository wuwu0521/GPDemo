
/**  
* @Title: TestJDKProxy.java  
* @Package com.demo.proxy  
* @Description: TODO(��һ�仰�������ļ���ʲô)  
* @author Administrator  
* @date 2019��4��19��  
* @version V1.0  
*/
package com.demo.proxy;

import java.lang.reflect.Method;

import com.demo.proxy.jdkproxy.Gril;
import com.demo.proxy.jdkproxy.JDKMeipo;

public class TestJDKProxy {

	public static void main(String[] args) {
		try {
			Object obj = new JDKMeipo().getInstance(new Gril());
			Method method = obj.getClass().getMethod("findLove", null);
			method.invoke(obj);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
