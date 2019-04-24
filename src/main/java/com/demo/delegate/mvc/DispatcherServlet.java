
/**  
* @Title: DispatcherServlet.java  
* @Package com.demo.delegate.mvc  
* @Description: TODO(用一句话描述该文件做什么)  
* @author Administrator  
* @date 2019年4月23日  
* @version V1.0  
*/
package com.demo.delegate.mvc;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DispatcherServlet extends HttpServlet {

	private List<Handler> handlerMapping = new ArrayList<Handler>();

	public void init() {
		try {
			Class<?> clazz = MemeberController.class;
			handlerMapping.add(new Handler().setController(clazz.newInstance())
					.setMethod(clazz.getMethod("getMemeberInfo", new Class[] { String.class }))
					.setUrl("web/getMemeberInfo"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private void doDishpatch(HttpServletRequest request,HttpServletResponse response){
		String uri = request.getRequestURI();
		Handler handler = null;
		for(Handler hl:handlerMapping){
			if(uri.equals(hl.getUrl())){
				handler = hl;
				break;
			}
		}
		Object obj =null;
		try {
			obj = handler.getMethod().invoke(handler.getController(), request.getParameter("mid"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	protected void service(HttpServletRequest request,HttpServletResponse response){
		doDishpatch(request, response);
	}

	class Handler {

		private Object controller;
		private Method method;
		private String url;

		public Object getController() {
			return controller;
		}

		public Handler setController(Object controller) {
			this.controller = controller;
			return this;
		}

		public Method getMethod() {
			return method;
		}

		public Handler setMethod(Method method) {
			this.method = method;
			return this;
		}

		public String getUrl() {
			return url;
		}

		public Handler setUrl(String url) {
			this.url = url;
			return this;
		}
	}
}
