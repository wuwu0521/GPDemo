
/**  
* @Title: GPer.java  
* @Package com.demo.observer.jdk  
* @Description: TODO(用一句话描述该文件做什么)  
* @author Administrator  
* @date 2019年5月4日  
* @version V1.0  
*/
package com.demo.design.observer.jdk;

import java.util.Observable;

public class GPer extends Observable{

	private String name="Gper生态圈";
	
	private static GPer gper=null;
	
	private GPer(){};
	
	public static GPer getIntance(){
		if(null == gper){
			gper = new GPer();
		}
		return gper;
	}
	
	public  String getName(){
		return name;
	}
	
	public void publishQuestion(Question question){
		System.out.println(question.getUserName()+"在"+this.name+"上提交了一个问题");
		setChanged();
		notifyObservers(question);
	}
}
