
/**  
* @Title: TestEventObserver.java  
* @Package com.demo.observer  
* @Description: TODO(用一句话描述该文件做什么)  
* @author Administrator  
* @date 2019年5月5日  
* @version V1.0  
*/
package com.demo.design.observer;

import com.demo.design.observer.jdk.event.Mouse;
import com.demo.design.observer.jdk.event.MouseEventCallback;
import com.demo.design.observer.jdk.event.MouseEventType;

public class TestEventObserver {

	public static void main(String[] args) {
		
		MouseEventCallback callback = new MouseEventCallback();
		Mouse mouse = new Mouse();
		mouse.addLisenter(MouseEventType.ON_CLICK,callback);
		mouse.click();
	}	
}
