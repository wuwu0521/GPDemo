
/**  
* @Title: Master.java  
* @Package com.demo.delegate  
* @Description: TODO(��һ�仰�������ļ���ʲô)  
* @author Administrator  
* @date 2019��4��22��  
* @version V1.0  
*/
package com.demo.design.delegate.simple;

public class Master {
	
	public void command(String command,Teacher teacher){
		teacher.learning(command);
	}
}
