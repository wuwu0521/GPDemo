
/**  
* @Title: LazyDoubleCheckSingleton.java  
* @Package com.demo.singleton.lazy  
* @Description: TODO(用一句话描述该文件做什么)  
* @author Administrator  
* @date 2019年4月16日  
* @version V1.0  
*/
package com.demo.design.singleton.lazy;

/**
 * 懒汉式单例
 */
public class LazyDoubleCheckSingleton {
	//volatile保证可见性，不保证原子性
	private volatile static LazyDoubleCheckSingleton instance;
	
	private LazyDoubleCheckSingleton(){}
	
	//synchronized阻塞并不是基于整个LazySimpleSingleton类的阻塞，而是在getInstance()
	public static LazyDoubleCheckSingleton getInstance(){
		if(instance==null){
			synchronized (LazyDoubleCheckSingleton.class) {
				//双重校验
				//此处有可能是,前一个抢占到所得线程已经创建了改实例,但是后面的并发线程拿到锁之后进来又会创建一次
				if(instance==null){
					instance = new LazyDoubleCheckSingleton();
				}
			}
		}
		return instance;
	}
}
