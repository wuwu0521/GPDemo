
/**  
* @Title: MouseEventCallback.java  
* @Package com.demo.observer.jdk.event  
* @Description: TODO(��һ�仰�������ļ���ʲô)  
* @author Administrator  
* @date 2019��5��5��  
* @version V1.0  
*/
package com.demo.observer.jdk.event;

public class MouseEventCallback {

	public void onClick(Event e){
		System.out.println("=====������굥���¼�=======\n"+e);
	}
	
	public void onDoubleClick(Event e){
		System.out.println("=====�������˫���¼�========\n"+e);
	}
	
	public void up(Event e){
		System.out.println("======�������̵����¼�======\n"+e);
	}
	
	public void onDown(Event e){
		System.out.println("======�������̰����¼�=======\n"+e);
	}
	
	public void onMove(Event e){
		System.out.println("======��������ƶ��¼�========\n"+e);
	}
	
	public void onWheel(Event e){
		System.out.println("=======�����������¼�=========\n"+e);
	}

	public void onOver(Event e){
		System.out.println("=======���������ͣ�¼�=======\n"+e);
	}
	
	public void onBlur(Event e){
		System.out.println("======�������ʧȥ�����¼�========\n"+e);
	}
	
	public void onFocus(Event e){
		System.out.println("=======��������ȡ�����¼�========\n"+e);
	}
}

