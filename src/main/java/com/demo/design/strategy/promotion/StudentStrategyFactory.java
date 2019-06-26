
/**  
* @Title: StudentStrategyFactory.java  
* @Package com.demo.strategy.promotion  
* @Description: TODO(用一句话描述该文件做什么)  
* @author Administrator  
* @date 2019年4月23日  
* @version V1.0  
*/
package com.demo.design.strategy.promotion;

import java.util.HashMap;
import java.util.Map;

public class StudentStrategyFactory {

	private static Map<String, Class> STUDENT_STRATEGY_MAP = new HashMap<String, Class>();

	private StudentStrategyFactory() {
	}

	static {
		STUDENT_STRATEGY_MAP.put("StudentA", new StudentA());
		STUDENT_STRATEGY_MAP.put("StudentB", new StudentB());
		STUDENT_STRATEGY_MAP.put("StudentC", new StudentC());
	}

	private static final Class NON_STUDENT = new StudentA();

	public static Class getStudentStrategy(String student) {
		Class clazz = STUDENT_STRATEGY_MAP.get(student);
		return clazz == null ? NON_STUDENT : clazz;
	}

}
