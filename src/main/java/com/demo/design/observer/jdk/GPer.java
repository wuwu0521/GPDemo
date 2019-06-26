
/**  
* @Title: GPer.java  
* @Package com.demo.observer.jdk  
* @Description: TODO(��һ�仰�������ļ���ʲô)  
* @author Administrator  
* @date 2019��5��4��  
* @version V1.0  
*/
package com.demo.design.observer.jdk;

import java.util.Observable;

public class GPer extends Observable{

	private String name="Gper��̬Ȧ";
	
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
		System.out.println(question.getUserName()+"��"+this.name+"���ύ��һ������");
		setChanged();
		notifyObservers(question);
	}
}
