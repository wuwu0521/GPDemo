
/**  
* @Title: GuavaEvent.java  
* @Package com.demo.observer.gava  
* @Description: TODO(��һ�仰�������ļ���ʲô)  
* @author Administrator  
* @date 2019��5��7��  
* @version V1.0  
*/
package com.demo.observer.gava;

import com.google.common.eventbus.Subscribe;

public class GuavaEvent {

	@Subscribe
	public void subscribe(String str){
		System.out.println("ִ��subscribe����,����Ϊ="+str);
	}
}
