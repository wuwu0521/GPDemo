
/**  
* @Title: StudentA.java  
* @Package com.demo.delegate  
* @Description: TODO(用一句话描述该文件做什么)  
* @author Administrator  
* @date 2019年4月22日  
* @version V1.0  
*/
package com.demo.strategy.promotion;

public class StudentA implements Class{

	@Override
	public void learning(String command) {
		System.out.println("StudentA learing"+command);
	}
}
