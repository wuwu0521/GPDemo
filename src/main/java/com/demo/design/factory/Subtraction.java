
/**  
* @Title: Subtraction.java  
* @Package com.demo.factory  
* @Description: TODO(用一句话描述该文件做什么)  
* @author Administrator  
* @date 2019年4月15日  
* @version V1.0  
*/
package com.demo.design.factory;

import java.math.BigDecimal;

public class Subtraction implements Operation{

	
	/**
	* 减法运算
	* @author Administrator  
	* @date 2019年4月15日   
	* @param  numberA
	* @param  numberB
	* @param @throws Exception    参数   
	* @return double
	*/  
	public double getResult(double numberA, double numberB) throws Exception {
		BigDecimal a = new BigDecimal(numberA);
		BigDecimal b = new BigDecimal(numberB);
		return a.subtract(b).doubleValue();
	}
}
