
/**  
* @Title: TestContainerSingleton.java  
* @Package com.demo.singleton  
* @Description: TODO(用一句话描述该文件做什么)  
* @author Administrator  
* @date 2019年4月16日  
* @version V1.0  
*/
package com.demo.design.singleton;

import com.demo.design.singleton.register.ContainerSingleton;

public class TestContainerSingleton {

	public static void main(String[] args) {
		 long start = System.currentTimeMillis();
		 try {
			ConcurrentExecutor.execute(new ConcurrentExecutor.RunHandler() {
				@Override
				public void handler() {
					Object obj = ContainerSingleton.getInstance("User");
					System.out.println(System.currentTimeMillis()+":"+obj);
				}
			 },10,6);
		} catch (Exception e) {
			e.printStackTrace();
		}
		 long end  = System.currentTimeMillis();
		 System.out.println(end-start);
	}

}
