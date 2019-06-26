
/**  
* @Title: Leader.java  
* @Package com.demo.delegate  
* @Description: TODO(用一句话描述该文件做什么)  
* @author Administrator  
* @date 2019年4月22日  
* @version V1.0  
*/
package com.demo.design.delegate.simple;

import java.util.HashMap;
import java.util.Map;

public class Teacher implements Class{

	private Map<String,Class> map = new HashMap<String,Class>();
	
	public Teacher(){
		map.put("English",new StudentA());
		map.put("Chinese", new StudentB());
	}
	
	@Override
	public void learning(String command) {
		map.get(command).learning(command);
	}
}
