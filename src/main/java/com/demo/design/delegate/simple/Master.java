
/**  
* @Title: Master.java  
* @Package com.demo.delegate  
* @Description: TODO(用一句话描述该文件做什么)  
* @author Administrator  
* @date 2019年4月22日  
* @version V1.0  
*/
package com.demo.design.delegate.simple;

public class Master {
	
	public void command(String command,Teacher teacher){
		teacher.learning(command);
	}
}
