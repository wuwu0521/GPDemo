
/**  
* @Title: TestGuavaEvent.java  
* @Package com.demo.observer  
* @Description: TODO(��һ�仰�������ļ���ʲô)  
* @author Administrator  
* @date 2019��5��7��  
* @version V1.0  
*/
package com.demo.observer;

import com.demo.observer.gava.GuavaEvent;
import com.google.common.eventbus.EventBus;

public class TestGuavaEvent {

	public static void main(String[] args) {
		EventBus eventBus = new EventBus();
		GuavaEvent event = new GuavaEvent();
		eventBus.register(event);
		eventBus.post("tom");
	}
}
