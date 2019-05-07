
/**  
* @Title: GuavaEvent.java  
* @Package com.demo.observer.gava  
* @Description: TODO(用一句话描述该文件做什么)  
* @author Administrator  
* @date 2019年5月7日  
* @version V1.0  
*/
package com.demo.observer.gava;

import com.google.common.eventbus.Subscribe;

public class GuavaEvent {

	@Subscribe
	public void subscribe(String str){
		System.out.println("执行subscribe方法,参数为="+str);
	}
}
