
/**  
* @Title: OrderServiceImpl.java  
* @Package com.demo.proxy.dbrouteproxy.order  
* @Description: TODO(��һ�仰�������ļ���ʲô)  
* @author Administrator  
* @date 2019��4��19��  
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
		System.out.println("OrderServiceImpl������������OrderDao");
		return ordeDao.insert(order);
	}

}
