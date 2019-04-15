
/**  
* @Title: Multiplication.java  
* @Package com.demo.factory  
* @Description: TODO(用一句话描述该文件做什么)  
* @author Administrator  
* @date 2019年4月15日  
* @version V1.0  
*/
package com.demo.factory;

import java.math.BigDecimal;

public class Multiplication implements Operation {

	
	/**
	* 乘法运算
	* @author Administrator  
	* @date 2019年4月15日   
	* @param  numberA
	* @param  numberB
	* @throws Exception    
	* @return double
	*/  
	public double getResult(double numberA, double numberB) throws Exception {
		BigDecimal a =new BigDecimal(numberA);
		BigDecimal b =new BigDecimal(numberB);
		return a.multiply(b).doubleValue();
	}
	
}
