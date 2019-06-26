
/**  
* @Title: TestDBrouteProxy.java  
* @Package com.demo.proxy  
* @Description: TODO(用一句话描述该文件做什么)  
* @author Administrator  
* @date 2019年4月19日  
* @version V1.0  
*/
package com.demo.design.proxy;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.demo.design.proxy.dbrouteproxy.order.Order;
import com.demo.design.proxy.dbrouteproxy.order.OrderService;
import com.demo.design.proxy.dbrouteproxy.order.OrderServiceImpl;
import com.demo.design.proxy.dbrouteproxy.proxy.OrderDynamicProxy;

public class TestDBrouteProxy {

	public static void main(String[] args) {
		Order order = new Order();
//		order.setCreateTime((new Date()).getTime());
//		OrderService orderService = new OrderServiceImpl();
//		OrderStaticProxy proxy = new OrderStaticProxy(orderService);
//		proxy.createOrder(order);
		
		try {
			  SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
	            Date date = sdf.parse("2017/02/01");
	            order.setCreateTime(date.getTime());

	            OrderService orderService = (OrderService)new OrderDynamicProxy().getInstance(new OrderServiceImpl());
	            orderService.createOrder(order);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
}
