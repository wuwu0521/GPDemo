
/**  
* @Title: TestGuavaObserver.java  
* @Package com.demo.observer  
* @Description: TODO(用一句话描述该文件做什么)  
* @author Administrator  
* @date 2019年5月7日  
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
		que.setContent("如何成为一个架构师");
		que.setUserName("小王");
		que.setTeacher("Tom");
		GuavaGPer gper = GuavaGPer.getIntance();
		eventBus.register(gper);
		eventBus.post(que);
	}
}
