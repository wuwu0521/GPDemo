
/**  
* @Title: TestEnumSingleton.java  
* @Package com.demo.singleton  
* @Description: TODO(用一句话描述该文件做什么)  
* @author Administrator  
* @date 2019年4月16日  
* @version V1.0  
*/
package com.demo.singleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.demo.singleton.register.EnumSingleton;

public class TestEnumSingleton {

	public static void main(String[] args) {
		
		//反射方式
//		try {
//			Class<?> clazz = EnumSingleton.class;
//			Constructor c = clazz.getDeclaredConstructor(String.class, int.class);
//			EnumSingleton enumSingleton = (EnumSingleton) c.newInstance();
//		} catch (Exception e) {
//			e.printStackTrace();
//		}

		//序列化方式
		try {
          EnumSingleton instance1 = null;

          EnumSingleton instance2 = EnumSingleton.getInstance();
          instance2.setData(new Object());

          FileOutputStream fos = new FileOutputStream("EnumSingleton.obj");
          ObjectOutputStream oos = new ObjectOutputStream(fos);
          oos.writeObject(instance2);
          oos.flush();
          oos.close();

          FileInputStream fis = new FileInputStream("EnumSingleton.obj");
          ObjectInputStream ois = new ObjectInputStream(fis);
          instance1 = (EnumSingleton) ois.readObject();
          ois.close();

          System.out.println(instance1.getData());
          System.out.println(instance2.getData());
          System.out.println(instance1.getData() == instance2.getData());

      }catch (Exception e){
          e.printStackTrace();
      }
  }
}