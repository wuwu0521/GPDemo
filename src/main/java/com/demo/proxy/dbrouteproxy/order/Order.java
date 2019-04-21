
/**  
* @Title: Order.java  
* @Package com.demo.proxy.dbrouteproxy.order  
* @Description: TODO(用一句话描述该文件做什么)  
* @author Administrator  
* @date 2019年4月19日  
* @version V1.0  
*/
package com.demo.proxy.dbrouteproxy.order;

public class Order {

	private Object orderInfo;
	
	private Long createTime;
	
	private String id;

	public Object getOrderInfo() {
		return orderInfo;
	}

	public void setOrderInfo(Object orderInfo) {
		this.orderInfo = orderInfo;
	}

	public Long getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Long createTime) {
		this.createTime = createTime;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
}
