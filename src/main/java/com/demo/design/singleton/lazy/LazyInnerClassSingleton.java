
/**  
* @Title: LazyInnerClassSingleton.java  
* @Package com.demo.singleton.lazy  
* @Description: TODO(用一句话描述该文件做什么)  
* @author Administrator  
* @date 2019年4月16日  
* @version V1.0  
*/
package com.demo.design.singleton.lazy;
//懒汉式静态内部类创建单例
public class LazyInnerClassSingleton {
	/**
	 * 默认使用LazyInnerClassSingleton的时候，会先初始化内部类 如果没使用的话，内部类是不加载的
	 */
	private LazyInnerClassSingleton(){
		//防止反射破坏单例
		if(LazyLoder.instance!=null){
			throw new RuntimeException("不允许创建多个实例");
		}
	}
	//static是为了使单例的空间共享,保证这个方法不会被重写,重载
	public static final LazyInnerClassSingleton getInstance(){
		//在返回结果以前，一定会先加载内部类
		return LazyLoder.instance;
	}
	
	private static class LazyLoder{
		private static final LazyInnerClassSingleton instance = new LazyInnerClassSingleton();
	}
}
