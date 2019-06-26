
/**  
* @Title: TestJDKObserver.java  
* @Package com.demo.observer  
* @Description: TODO(��һ�仰�������ļ���ʲô)  
* @author Administrator  
* @date 2019��5��4��  
* @version V1.0  
*/
package com.demo.design.observer;

import com.demo.design.observer.jdk.GPer;
import com.demo.design.observer.jdk.Question;
import com.demo.design.observer.jdk.Teacher;

public class TestJDKObserver {

	public static void main(String[] args) {
		GPer gper = GPer.getIntance();
		Teacher teacher = new Teacher("wuwu");
		gper.addObserver(teacher);
		Question que = new Question();
		que.setContent("��γ�Ϊһ���ܹ�ʦ");
		que.setUserName("С��");
		gper.publishQuestion(que);
	}
}
