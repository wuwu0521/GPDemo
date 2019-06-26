
/**  
* @Title: Event.java  
* @Package com.demo.observer.jdk.event  
* @Description: TODO(用一句话描述该文件做什么)  
* @author Administrator  
* @date 2019年5月4日  
* @version V1.0  
*/
package com.demo.design.observer.jdk.event;

import java.lang.reflect.Method;

public class Event {

	private Object source;
	
	private Object target;
	
	private Method callback;
	
	private String trigger;
	
	private long time;

	/**  
	* 创建一个新的实例 Event.  
	*    
	*/ 
	public Event(Object target,Method callback) {
		this.target = target;
		this.callback = callback;
	}
	
	public Event setSource(Object source){
		this.source = source;
		return this;
	}
	public Event setTime(long time){
		this.time = time;
		return this;
	}
	
	public Object getSource(Object source){
		this.source = source;
		return this;
	}
	
	public Event setTrigger(String trigger){
		this.trigger = trigger;
		return this;
	}
	
	public long getTime(){
		return time;
	}
	
	public Object getTrigger(){
		return trigger;
	}
	
	public Method getCallback(){
		return callback;
	}
	
	public Object getTarget() {
		return target;
	}

	@Override
	public String toString() {
		return "Event [source=" + source + ", target=" + target + ", trigger=" + trigger + ", time=" + time + "]";
	}

	
}
