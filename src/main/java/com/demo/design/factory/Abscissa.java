
/**  
* @Title: Abscissa.java  
* @Package com.demo.factory  
* @Description: TODO(用一句话描述该文件做什么)  
* @author Administrator  
* @date 2019年4月15日  
* @version V1.0  
*/
package com.demo.design.factory;

public class Abscissa implements Space{

	
	@Override
	public void createCoordinate() {
		System.out.println("创建横向坐标系");
	}

}
