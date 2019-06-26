
/**  
* @Title: Addition.java  
* @Package com.demo.factory  
* @Description: TODO(用一句话描述该文件做什么)  
* @author Administrator  
* @date 2019年4月15日  
* @version V1.0  
*/
package com.demo.design.factory;

import java.math.BigDecimal;

public class Addition implements Operation{

	
	/**
	 * 加法运算
	* @author Administrator  
	* @date 2019年4月15日   
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
