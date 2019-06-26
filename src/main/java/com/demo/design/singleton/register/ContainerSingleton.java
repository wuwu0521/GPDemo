
/**  
* @Title: ContainerSingleton.java  
* @Package com.demo.singleton.register  
* @Description: TODO(用一句话描述该文件做什么)  
* @author Administrator  
* @date 2019年4月16日  
* @version V1.0  
*/
package com.demo.design.singleton.register;

import java.util.HashMap;
import java.util.Map;

//注册式单例
public class ContainerSingleton{

	private ContainerSingleton() {
	};

	private static Map<String, Object> map = new HashMap<String, Object>();

	public static Object getInstance(String className) {

		synchronized (map) {
			if (map.containsKey(className)){
				return map.get(className);
			}
			Object obj = null;
			try {
				obj = Class.forName(className).newInstance();
				map.put(className, obj);
			} catch (Exception e) {
				e.printStackTrace();
			}
			return obj;
		}
	}
}
