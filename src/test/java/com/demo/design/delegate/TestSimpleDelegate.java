
/**  
* @Title: TestSimpleDelegate.java  
* @Package com.demo.delegate  
* @Description: TODO(��һ�仰�������ļ���ʲô)  
* @author Administrator  
* @date 2019��4��23��  
* @version V1.0  
*/
package com.demo.design.delegate;

import com.demo.design.delegate.simple.Master;
import com.demo.design.delegate.simple.Teacher;

public class TestSimpleDelegate {

	public static void main(String[] args) {
		new Master().command("English", new Teacher());
	}
}
