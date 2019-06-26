
/**  
* @Title: Mouse.java  
* @Package com.demo.observer.jdk.event  
* @Description: TODO(��һ�仰�������ļ���ʲô)  
* @author Administrator  
* @date 2019��5��5��  
* @version V1.0  
*/
package com.demo.design.observer.jdk.event;

public class Mouse extends EventLisenter {

	public void click(){
		System.out.println("�����¼�");
		this.trigger(MouseEventType.ON_CLICK);
	}
	
	public void doubleClick(){
		System.out.println("˫���¼�");
		this.trigger(MouseEventType.ON_DOUBLE_CLICK);
	}
	
	public void up(){
		System.out.println("�����¼�");
		this.trigger(MouseEventType.ON_UP);
	}
	
	public void down(){
		System.out.println("�����¼�");
		this.trigger(MouseEventType.ON_DOWN);
	}
	
	public void move(){
		System.out.println("�ƶ��¼�");
		this.trigger(MouseEventType.ON_MOVE);
	}
	public void wheel(){
		System.out.println("�����¼�");
		this.trigger(MouseEventType.ON_WHEEL);
	}

	public void over(){
		System.out.println("��ͣ�¼�");
		this.trigger(MouseEventType.ON_OVER);
	}
	
	public void blur(){
		System.out.println("ʧȥ�����¼�");
		this.trigger(MouseEventType.ON_BLUR);
	}
	
	public void focus(){
		System.out.println("��ȡ�����¼�");
		this.trigger(MouseEventType.ON_FOCUS);
	}
}
