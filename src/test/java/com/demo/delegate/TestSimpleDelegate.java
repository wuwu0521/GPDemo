
/**  
* @Title: TestSimpleDelegate.java  
* @Package com.demo.delegate  
* @Description: TODO(用一句话描述该文件做什么)  
* @author Administrator  
* @date 2019年4月23日  
* @version V1.0  
*/
package com.demo.delegate;

import com.demo.delegate.simple.Master;
import com.demo.delegate.simple.Teacher;

public class TestSimpleDelegate {

	public static void main(String[] args) {
		new Master().command("English", new Teacher());
	}
}
