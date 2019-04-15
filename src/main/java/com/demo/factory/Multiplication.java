
/**  
* @Title: Multiplication.java  
* @Package com.demo.factory  
* @Description: TODO(��һ�仰�������ļ���ʲô)  
* @author Administrator  
* @date 2019��4��15��  
* @version V1.0  
*/
package com.demo.factory;

import java.math.BigDecimal;

public class Multiplication implements Operation {

	
	/**
	* �˷�����
	* @author Administrator  
	* @date 2019��4��15��   
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
