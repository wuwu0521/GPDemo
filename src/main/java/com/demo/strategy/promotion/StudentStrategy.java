
/**  
* @Title: StudentStrategy.java  
* @Package com.demo.strategy.promotion  
* @Description: TODO(��һ�仰�������ļ���ʲô)  
* @author Administrator  
* @date 2019��4��23��  
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
