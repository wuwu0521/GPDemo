
/**  
* @Title: Addition.java  
* @Package com.demo.factory  
* @Description: TODO(��һ�仰�������ļ���ʲô)  
* @author Administrator  
* @date 2019��4��15��  
* @version V1.0  
*/
package com.demo.design.factory;

import java.math.BigDecimal;

public class Addition implements Operation{

	
	/**
	 * �ӷ�����
	* @author Administrator  
	* @date 2019��4��15��   
	* @param  numberA
	* @param  numberB
	* @return double
	* @throws Exception  
	*/  
	public double getResult(double numberA, double numberB) throws Exception {
		BigDecimal a = new BigDecimal(numberA);
		BigDecimal b = new BigDecimal(numberB);
		return a.add(b).doubleValue();
	}

}
