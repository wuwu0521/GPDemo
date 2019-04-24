
/**  
* @Title: TestPromotionStrategy.java  
* @Package com.demo.delegate  
* @Description: TODO(用一句话描述该文件做什么)  
* @author Administrator  
* @date 2019年4月23日  
* @version V1.0  
*/
package com.demo.strategy;

import com.demo.strategy.promotion.StudentStrategy;
import com.demo.strategy.promotion.StudentStrategyFactory;

public class TestPromotionStrategy {

	public static void main(String[] args) {
		
		StudentStrategy strategy = new StudentStrategy(StudentStrategyFactory.getStudentStrategy("StudentA"));
		strategy.execute("English");
	}
}
