
/**  
* @Title: TestPromotionStrategy.java  
* @Package com.demo.delegate  
* @Description: TODO(��һ�仰�������ļ���ʲô)  
* @author Administrator  
* @date 2019��4��23��  
* @version V1.0  
*/
package com.demo.design.strategy;

import com.demo.design.strategy.promotion.StudentStrategy;
import com.demo.design.strategy.promotion.StudentStrategyFactory;

public class TestPromotionStrategy {

	public static void main(String[] args) {
		
		StudentStrategy strategy = new StudentStrategy(StudentStrategyFactory.getStudentStrategy("StudentA"));
		strategy.execute("English");
	}
}
