
/**  
* @Title: MouseEventType.java  
* @Package com.demo.observer.jdk.event  
* @Description: TODO(用一句话描述该文件做什么)  
* @author Administrator  
* @date 2019年5月4日  
* @version V1.0  
*/
package com.demo.observer.jdk.event;

public interface MouseEventType {

	//单击
	String ON_CLICK = "click";

	//双击
	String ON_DOUBLE_CLICK = "doubleClick";

	//弹起
	String ON_UP = "up";

	//按下
	String ON_DOWN = "down";

	//移动
	String ON_MOVE = "move";

	//滚动
	String ON_WHEEL = "wheel";

	//悬停
	String ON_OVER = "over";

	//失焦
	String ON_BLUR = "blur";

	//聚焦
	String ON_FOCUS = "focus";
}
