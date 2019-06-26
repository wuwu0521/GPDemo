
/**  
* @Title: OrderStaticProxy.java  
* @Package com.demo.proxy.dbrouteproxy.proxy  
* @Description: TODO(用一句话描述该文件做什么)  
* @author Administrator  
* @date 2019年4月19日  
* @version V1.0  
*/
package com.demo.design.proxy.dbrouteproxy.proxy;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.demo.design.proxy.dbrouteproxy.dataSource.DynamicDataSourceEntity;
import com.demo.design.proxy.dbrouteproxy.order.Order;
import com.demo.design.proxy.dbrouteproxy.order.OrderService;

public class OrderStaticProxy implements OrderService {

	private OrderService orderService;

	public OrderStaticProxy(OrderService orderService){
		this.orderService = orderService;
	}

	SimpleDateFormat sd = new SimpleDateFormat("yyyy");
	
	@Override
	public int createOrder(Order order) {
		long time = order.getCreateTime();
		Integer dbRouter = Integer.valueOf(sd.format(new Date(time)));
		DynamicDataSourceEntity.set(dbRouter);
        System.out.println("静态代理类自动分配到【DB_" +  dbRouter + "】数据源处理数据" );
		this.orderService.createOrder(order);
		DynamicDataSourceEntity.restore();
		return 0;
	}
	
	
}
