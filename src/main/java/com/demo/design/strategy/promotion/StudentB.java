
/**  
* @Title: StudentB.java  
* @Package com.demo.delegate  
* @Description: TODO(用一句话描述该文件做什么)  
* @author Administrator  
* @date 2019年4月22日  
* @version V1.0  
*/
package com.demo.design.strategy.promotion;

public class StudentB implements Class {

	@Override
	public void learning(String command) {
		System.out.println("StudentB Learning " + command);
	}
}
