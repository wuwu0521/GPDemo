
/**  
* @Title: OrderDao.java  
* @Package com.demo.proxy.dbrouteproxy.order  
* @Description: TODO(用一句话描述该文件做什么)  
* @author Administrator  
* @date 2019年4月19日  
* @version V1.0  
*/
package com.demo.proxy.dbrouteproxy.order;

public class OrderDao {

	public int insert(Order order){
		System.out.println("保存成功");
		return 1;
	};
}
