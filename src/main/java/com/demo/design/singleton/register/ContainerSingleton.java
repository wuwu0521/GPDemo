
/**  
* @Title: ContainerSingleton.java  
* @Package com.demo.singleton.register  
* @Description: TODO(��һ�仰�������ļ���ʲô)  
* @author Administrator  
* @date 2019��4��16��  
* @version V1.0  
*/
package com.demo.design.singleton.register;

import java.util.HashMap;
import java.util.Map;

//ע��ʽ����
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
