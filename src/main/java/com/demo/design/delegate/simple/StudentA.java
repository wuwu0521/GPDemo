
/**  
* @Title: StudentA.java  
* @Package com.demo.delegate  
* @Description: TODO(��һ�仰�������ļ���ʲô)  
* @author Administrator  
* @date 2019��4��22��  
* @version V1.0  
*/
package com.demo.design.delegate.simple;

public class StudentA implements Class {

	@Override
	public void learning(String command) {
		System.out.println("StudentA learing"+command);
	}
}
