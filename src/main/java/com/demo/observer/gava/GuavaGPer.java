
/**  
* @Title: GuavaGPer.java  
* @Package com.demo.observer.gava  
* @Description: TODO(用一句话描述该文件做什么)  
* @author Administrator  
* @date 2019年5月7日  
* @version V1.0  
*/
package com.demo.observer.gava;

import com.demo.observer.jdk.Question;
import com.google.common.eventbus.Subscribe;

public class GuavaGPer {

	private String name="Gper生态圈";
	
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
		System.out.println(question.getUserName()+"在"+this.name+"上提交了一个问题");
		System.out.println("+++++++++++++++++++++++++++++++++");
		System.out.println(question.getTeacher()+"老师\n"+
				"收到了一个来自"+gper.getName()+"的问题\n"+
						"问题内容如下：\n"+question.getContent()+"\n"+"提问者："+question.getUserName());
	}
}
