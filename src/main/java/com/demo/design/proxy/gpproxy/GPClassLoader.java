
/**  
* @Title: GPClassLoder.java  
* @Package com.demo.proxy.gpproxy  
* @Description: TODO(��һ�仰�������ļ���ʲô)  
* @author Administrator  
* @date 2019��4��19��  
* @version V1.0  
*/
package com.demo.design.proxy.gpproxy;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;

public class GPClassLoader extends ClassLoader{

	private File classPathFile = new File("E:/Eclipse Workspace/GPDemo/target/classes/com/demo/proxy/gpproxy/");
	
//	public GPClassLoader(){
//		String classPath = GPClassLoader.class.getResource("").getPath();
//		this.classPathFile = new File(classPath);
//	}
	
	public Class<?> findClass(String name) {
		String className = GPClassLoader.class.getPackage().getName() + "." + name;
		if (classPathFile != null) {
			File classFile = new File(classPathFile, name.replaceAll("\\.", "/") + ".class");
			if (classFile.exists()) {
				FileInputStream in = null;
				ByteArrayOutputStream out = null;
				try {
					in = new FileInputStream(classFile);
					out = new ByteArrayOutputStream();
					byte[] buff = new byte[1024];
					int len;
					while ((len = in.read(buff)) != -1) {
						out.write(buff, 0, len);
					}
					return defineClass(className, out.toByteArray(), 0, out.size());
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
		return null;
	}
	
	
}
