
/**  
* @Title: DynamicDataSourceEntity.java  
* @Package com.demo.proxy.dbrouteproxy.dataSource  
* @Description: TODO(��һ�仰�������ļ���ʲô)  
* @author Administrator  
* @date 2019��4��19��  
* @version V1.0  
*/
package com.demo.proxy.dbrouteproxy.dataSource;

public class DynamicDataSourceEntity {

	public final static String DEFAULE_SOURCE = null;

	private final static ThreadLocal<String> local = new ThreadLocal<String>();

	private DynamicDataSourceEntity() {};

	public static String get() {
		return local.get();
	}

	public static void restore() {
		local.set(DEFAULE_SOURCE);
	}

	public static void set(String source) {
		local.set(source);
	}

	public static void set(int year) {
		local.set("DB" + year);
	}
}
