
/**  
* @Title: TestGuavaObserver.java  
* @Package com.demo.observer  
* @Description: TODO(��һ�仰�������ļ���ʲô)  
* @author Administrator  
* @date 2019��5��7��  
* @version V1.0  
*/
package com.demo.observer;

import com.demo.observer.gava.GuavaGPer;
import com.demo.observer.jdk.Question;
import com.google.common.eventbus.EventBus;

public class TestGuavaObserver {

	public static void main(String[] args) {
		EventBus eventBus = new EventBus();
		Question que = new Question();
		que.setContent("��γ�Ϊһ���ܹ�ʦ");
		que.setUserName("С��");
		que.setTeacher("Tom");
		GuavaGPer gper = GuavaGPer.getIntance();
		eventBus.register(gper);
		eventBus.post(que);
	}
}
