
/**  
* @Title: EventLisenter.java  
* @Package com.demo.observer.jdk.event  
* @Description: TODO(��һ�仰�������ļ���ʲô)  
* @author Administrator  
* @date 2019��5��4��  
* @version V1.0  
*/
package com.demo.design.observer.jdk.event;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

public class EventLisenter {

	protected Map<String,Event> events =new HashMap<String,Event>();
	
	public void addLisenter(String eventType,Object target){
		try {
			this.addLisenter(eventType,target,target.getClass().getMethod("on"+toUpperFirstCase(eventType), Event.class));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void addLisenter(String eventType, Object target, Method method) {
		events.put(eventType, new Event(target,method));
	}
	
	private void trigger(Event event) {
		event.setSource(this);
		event.setTime(System.currentTimeMillis());
		try {
			if (event.getCallback() != null) {
				event.getCallback().invoke(event.getTarget(), event);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	protected void trigger(String trigger){
		if(!this.events.containsKey(trigger)){
			return ;
		}
		trigger(this.events.get(trigger).setTrigger(trigger));
	}

	private String toUpperFirstCase(String eventType) {
		char[] chars = eventType.toCharArray();
		chars[0] -= 32;
		return String.valueOf(chars);
	}
}
