
/**  
* @Title: StudentStrategy.java  
* @Package com.demo.strategy.promotion  
* @Description: TODO(用一句话描述该文件做什么)  
* @author Administrator  
* @date 2019年4月23日  
* @version V1.0  
*/
package com.demo.strategy.promotion;

public class StudentStrategy {

	private Class clazz;
	
	public StudentStrategy(Class clazz){
		this.clazz = clazz;
	}
	
	public void execute(String command){
		clazz.learning(command);
	}
}
