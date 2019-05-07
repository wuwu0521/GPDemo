
/**  
* @Title: GuavaGPer.java  
* @Package com.demo.observer.gava  
* @Description: TODO(��һ�仰�������ļ���ʲô)  
* @author Administrator  
* @date 2019��5��7��  
* @version V1.0  
*/
package com.demo.observer.gava;

import com.demo.observer.jdk.Question;
import com.google.common.eventbus.Subscribe;

public class GuavaGPer {

	private String name="Gper��̬Ȧ";
	
	private static GuavaGPer gper=null;
	
	private GuavaGPer(){};
	
	public static GuavaGPer getIntance(){
		if(null == gper){
			gper = new GuavaGPer();
		}
		return gper;
	}
	
	public  String getName(){
		return name;
	}
	
	@Subscribe
	public void publishQuestion(Question question){
		System.out.println(question.getUserName()+"��"+this.name+"���ύ��һ������");
		System.out.println("+++++++++++++++++++++++++++++++++");
		System.out.println(question.getTeacher()+"��ʦ\n"+
				"�յ���һ������"+gper.getName()+"������\n"+
						"�����������£�\n"+question.getContent()+"\n"+"�����ߣ�"+question.getUserName());
	}
}
