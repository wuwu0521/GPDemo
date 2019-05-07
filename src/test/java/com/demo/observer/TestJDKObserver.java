
/**  
* @Title: TestJDKObserver.java  
* @Package com.demo.observer  
* @Description: TODO(用一句话描述该文件做什么)  
* @author Administrator  
* @date 2019年5月4日  
* @version V1.0  
*/
package com.demo.observer;

import com.demo.observer.jdk.GPer;
import com.demo.observer.jdk.Question;
import com.demo.observer.jdk.Teacher;

public class TestJDKObserver {

	public static void main(String[] args) {
		GPer gper = GPer.getIntance();
		Teacher teacher = new Teacher("wuwu");
		gper.addObserver(teacher);
		Question que = new Question();
		que.setContent("如何成为一个架构师");
		que.setUserName("小王");
		gper.publishQuestion(que);
	}
}
