
/**  
* @Title: Mouse.java  
* @Package com.demo.observer.jdk.event  
* @Description: TODO(用一句话描述该文件做什么)  
* @author Administrator  
* @date 2019年5月5日  
* @version V1.0  
*/
package com.demo.design.observer.jdk.event;

public class Mouse extends EventLisenter {

	public void click(){
		System.out.println("单击事件");
		this.trigger(MouseEventType.ON_CLICK);
	}
	
	public void doubleClick(){
		System.out.println("双击事件");
		this.trigger(MouseEventType.ON_DOUBLE_CLICK);
	}
	
	public void up(){
		System.out.println("弹起事件");
		this.trigger(MouseEventType.ON_UP);
	}
	
	public void down(){
		System.out.println("按下事件");
		this.trigger(MouseEventType.ON_DOWN);
	}
	
	public void move(){
		System.out.println("移动事件");
		this.trigger(MouseEventType.ON_MOVE);
	}
	public void wheel(){
		System.out.println("滚动事件");
		this.trigger(MouseEventType.ON_WHEEL);
	}

	public void over(){
		System.out.println("悬停事件");
		this.trigger(MouseEventType.ON_OVER);
	}
	
	public void blur(){
		System.out.println("失去焦点事件");
		this.trigger(MouseEventType.ON_BLUR);
	}
	
	public void focus(){
		System.out.println("获取焦点事件");
		this.trigger(MouseEventType.ON_FOCUS);
	}
}
