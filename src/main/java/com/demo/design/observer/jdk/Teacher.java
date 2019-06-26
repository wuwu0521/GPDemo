
/**  
* @Title: Teacher.java  
* @Package com.demo.observer.jdk  
* @Description: TODO(用一句话描述该文件做什么)  
* @author Administrator  
* @date 2019年5月4日  
* @version V1.0  
*/
package com.demo.design.observer.jdk;

import java.util.Observer;
import java.util.Observable;
public class Teacher implements Observer{

	private String name;
	
	public Teacher(String name){
		this.name=name;
	}
	
	@Override
	public void update(Observable obs, Object obj) {
		GPer gper = (GPer)obs;
		Question que =(Question)obj;
		System.out.println("+++++++++++++++++++++++++++++++++");
		System.out.println(name+"老师\n"+
		"收到了一个来自"+gper.getName()+"的问题\n"+
				"问题内容如下：\n"+que.getContent()+"\n"+"提问者："+que.getUserName());
	}
}
