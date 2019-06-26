
/**  
* @Title: OrderServiceImpl.java  
* @Package com.demo.proxy.dbrouteproxy.order  
* @Description: TODO(用一句话描述该文件做什么)  
* @author Administrator  
* @date 2019年4月19日  
* @version V1.0  
*/
package com.demo.design.proxy.dbrouteproxy.order;

public class OrderServiceImpl implements OrderService {

	private OrderDao ordeDao;
	
	public OrderServiceImpl(){
		this.ordeDao = new OrderDao();
	}
	
	@Override
	public int createOrder(Order order) {
		System.out.println("OrderServiceImpl创建订单调用OrderDao");
		return ordeDao.insert(order);
	}

}
