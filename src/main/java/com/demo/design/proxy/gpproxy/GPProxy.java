
/**  
* @Title: GPProxy.java  
* @Package com.demo.proxy.gpproxy  
* @Description: TODO(��һ�仰�������ļ���ʲô)  
* @author Administrator  
* @date 2019��4��19��  
* @version V1.0  
*/
package com.demo.design.proxy.gpproxy;

import java.io.File;
import java.io.FileWriter;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

import javax.tools.JavaCompiler;
import javax.tools.StandardJavaFileManager;
import javax.tools.ToolProvider;

public class GPProxy {

	public static final String ln = "\r\n";
	
	public static Object newProxyInstance(GPClassLoader classLoader,Class<?> [] interfaces,GPInvocationHandler h){
		try{
			//��̬����Դ����.java�ļ�
			String src = generateSrc(interfaces);
			
			//java�ļ��������
//			String filePath = GPProxy.class.getResource("").getPath();
			String filePath = "E:/Eclipse Workspace/GPDemo/target/classes/com/demo/proxy/gpproxy/";
			File f= new File(filePath+"$Proxy0.java");
			FileWriter fw = new FileWriter(f);
			fw.write(src);
			fw.flush();
			fw.close();
			
			//�����ɵ�.java�ļ������.class�ļ�
			JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
			StandardJavaFileManager manage = compiler.getStandardFileManager(null,null, null);
			Iterable iterale = manage.getJavaFileObjects(f);
			JavaCompiler.CompilationTask task = compiler.getTask(null, manage, null, null, null, iterale);
			task.call();
			manage.close();
			
			//�������ɵ�.class�ļ����ص�jvm��
			Class proxyClass = classLoader.findClass("$Proxy0");
			Constructor c = proxyClass.getConstructor(GPInvocationHandler.class);
			f.delete();
			//�����ֽ��������Ժ���µĴ������
			return c.newInstance(h);
		}catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	private static String generateSrc(Class<?>[] interfaces) {

		StringBuffer sb = new StringBuffer();
		sb.append("package com.demo.proxy.gpproxy;" + ln);
		sb.append("import Person;" + ln);
		sb.append("import java.lang.reflect.*;" + ln);
		sb.append("public class $Proxy0 implements " + interfaces[0].getName() + "{" + ln);
		sb.append("GPInvocationHandler h;" + ln);
		sb.append("public $Proxy0(GPInvocationHandler h){" + ln);
		sb.append("this.h=h;");
		sb.append("}" + ln);
		for (Method m : interfaces[0].getMethods()) {
			Class<?>[] params = m.getParameterTypes();
			StringBuffer paramNames = new StringBuffer();
			StringBuffer paramValues = new StringBuffer();
			StringBuffer paramClasses = new StringBuffer();
			for(int i=0; i<params.length;i++){
				Class clazz = params[i];
				String type =clazz.getName();
				String paramName = toLowerFirstCase(clazz.getSimpleName());
				paramNames.append(type+" "+paramName);
				paramValues.append(paramName);
				paramClasses.append(clazz.getName()+".class");
				if(i>0 && i<params.length-1){
					paramNames.append(",");
					paramValues.append(",");
					paramClasses.append(",");
				}
			}
			
			sb.append("public "+m.getReturnType().getName()+" "+m.getName()+"("+paramNames.toString()+"){"+ln);
				sb.append("try{"+ln);
					sb.append("Method m = "+interfaces[0].getName()+".class.getMethod(\""+m.getName()+"\",new Class[]{"+paramClasses.toString()+"});"+ln);
					sb.append((hasReturnValue(m.getReturnType())?"return":"")+getCaseCode("this.h.invoke(this,m,new Object[]{"+paramValues+"})",m.getReturnType())+";"+ln);
				sb.append("}catch(Error _ex){ }");
				sb.append("catch(Throwable e){"+ln);
				sb.append("throw new UndeclaredThrowableException(e);"+ln);
				sb.append("}");
				sb.append(getReturnEmptyCode(m.getReturnType()));
			sb.append("}");
		}
		sb.append("}"+ln);
		return sb.toString();
	}

	private static Map<Class,Class> mappings = new HashMap<Class,Class>();
	static{
		mappings.put(int.class, Integer.class);
	}
	
	private static String getReturnEmptyCode(Class<?> returnClass){
		if(mappings.containsKey(returnClass)){ 
			return "return 0;";
		}else if(returnClass==void.class){
			return "";
		}else{
			return "return null;";
		}
	}
	
	private static boolean hasReturnValue(Class<?> returnType) {
		return returnType!=void.class;
	}

	private static String getCaseCode(String code, Class<?> returnType) {
		if(mappings.containsKey(returnType)){
			return "(("+mappings.get(returnType).getName()+")"+code+")."+returnType.getSimpleName()+"Value()";
		}
		return code;
	}

	private static String toLowerFirstCase(String src) {
		char [] chars = src.toCharArray();
        chars[0] += 32;
        return String.valueOf(chars);
	}
}
