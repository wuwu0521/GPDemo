
/**  
* @Title: Teacher.java  
* @Package com.demo.observer.jdk  
* @Description: TODO(��һ�仰�������ļ���ʲô)  
* @author Administrator  
* @date 2019��5��4��  
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
		System.out.println(name+"��ʦ\n"+
		"�յ���һ������"+gper.getName()+"������\n"+
				"�����������£�\n"+que.getContent()+"\n"+"�����ߣ�"+que.getUserName());
	}
}
