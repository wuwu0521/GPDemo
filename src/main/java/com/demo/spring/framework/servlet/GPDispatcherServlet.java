package com.demo.spring.framework.servlet;

import com.demo.design.proxy.gpproxy.GPInvocationHandler;
import com.demo.spring.framework.annotation.GPController;
import com.demo.spring.framework.annotation.GPRequestMapping;
import com.demo.spring.framework.context.GPApplicationContext;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * GPDispatcherServlet为MVC启动时的入口
 */
public class GPDispatcherServlet extends HttpServlet {

    private final String LOCATION = "contextConfigLocation";

    private List<GPHandlerMapping> handlerMappings = new ArrayList<GPHandlerMapping>();

    private Map<GPHandlerMapping, GPHandlerAdapter> handlerAdapterMap = new HashMap<GPHandlerMapping, GPHandlerAdapter>();

    private List<GPViewResolver> viewResolvers = new ArrayList<GPViewResolver>();

    private GPApplicationContext applicationContext;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            doDispatch(req, resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void doDispatch(HttpServletRequest req, HttpServletResponse resp) throws Exception {
        GPHandlerMapping handler = gerHandler(req);
        if (handler == null) {
            processDispatchResult(req, resp, new GPModelAndView("404"));
            return;
        }

        GPHandlerAdapter adapter = getHandlerAdapter(handler);

        GPModelAndView view = adapter.handle(req, resp, handler);

        processDispatchResult(req, resp, view);

    }

    private GPHandlerAdapter getHandlerAdapter(GPHandlerMapping handler) {
        if (this.handlerAdapterMap.isEmpty()) {
            return null;
        }
        GPHandlerAdapter adapter = this.handlerAdapterMap.get(handler);
        if (adapter.supports(handler)) {
            return adapter;
        }
        return null;
    }

    private void processDispatchResult(HttpServletRequest req, HttpServletResponse resp, GPModelAndView gpModelAndView) throws Exception {
        if (null == gpModelAndView) {
            return;
        }
        if (this.viewResolvers.isEmpty()) {
            return;
        }
        if (this.viewResolvers != null) {
            for (GPViewResolver viewResolver : this.viewResolvers) {
                GPView view = viewResolver.resolveViewName(gpModelAndView.getViewName(), null);
                if (view != null) {
                    view.render(gpModelAndView.getModel(), req, resp);
                    return;
                }
            }
        }
    }

    private GPHandlerMapping gerHandler(HttpServletRequest req) {
        if (this.handlerMappings.isEmpty()) {
            return null;
        }
        String url = req.getRequestURI();
        String contextPath = req.getContextPath();
        url = url.replace(contextPath, "").replaceAll("/+", "/");
        for (GPHandlerMapping handlerMapping : this.handlerMappings) {
            Matcher matcher = handlerMapping.getPattern().matcher(url);
            if (!matcher.matches()) {
                continue;
            }
            return handlerMapping;
        }
        return null;
    }

    @Override
    public void init(ServletConfig config) throws ServletException {
        applicationContext = new GPApplicationContext(config.getInitParameter(LOCATION));
        //初始化MVC九大组件
        initStrategies(applicationContext);
    }

    private void initStrategies(GPApplicationContext applicationContext) {
        //1 多文件上传组件
        initMultipartResolver(applicationContext);

        //2 初始化本地语言环境
        initLocaleResolver(applicationContext);

        //3 初始化模板处理器
        initThemeResolver(applicationContext);

        //4 url请求映射处理器
        initHandlerMappings(applicationContext);

        //5 初始化参数适配器
        initHandlerAdapters(applicationContext);

        //6 初始化异常拦截器
        initHandlerExceptionResolvers(applicationContext);

        //7 初始化视图预处理器
        initRequestToViewNameTranslator(applicationContext);

        //8 初始化视图转换器
        initViewResolvers(applicationContext);

        //9 flash映射管理器
        initFlashMapManager(applicationContext);
    }

    private void initHandlerMappings(GPApplicationContext applicationContext) {
        String[] beanNames = applicationContext.getBeanDefinitionNames();
        try {
            for (String beanName : beanNames) {

                Object controller = applicationContext.getBean(beanName);
                Class<?> clazz = controller.getClass();
                if (!clazz.isAnnotationPresent(GPController.class)) {
                    continue;
                }
                String baseUrl = "";
                if (clazz.isAnnotationPresent(GPRequestMapping.class)) {
                    GPRequestMapping requestMapping = clazz.getAnnotation(GPRequestMapping.class);
                    baseUrl = requestMapping.value();
                }
                //扫描所有的public方法
                Method[] methods = clazz.getMethods();
                for (Method method : methods) {
                    if (!method.isAnnotationPresent(GPRequestMapping.class)) {
                        continue;
                    }
                    GPRequestMapping requestMapping = method.getAnnotation(GPRequestMapping.class);
                    String regex = ("/" + baseUrl + requestMapping.value().replaceAll("\\*", "*")).replaceAll("/+", "/");
                    Pattern pattern = Pattern.compile(regex);
                    this.handlerMappings.add(new GPHandlerMapping(controller, method, pattern));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void initFlashMapManager(GPApplicationContext applicationContext) {
    }

    private void initViewResolvers(GPApplicationContext applicationContext) {
        String templateRoot = applicationContext.getConfig().getProperty("templateRoot");
        String templateRootPath = this.getClass().getClassLoader().getResource(templateRoot).getFile();
        File templateRootDir = new File(templateRootPath);
        String[] templates = templateRootDir.list();
        for (int i = 0; i < templates.length; i++) {
            this.viewResolvers.add(new GPViewResolver(templateRoot));
        }

    }

    private void initRequestToViewNameTranslator(GPApplicationContext applicationContext) {
    }

    private void initHandlerExceptionResolvers(GPApplicationContext applicationContext) {
    }

    private void initHandlerAdapters(GPApplicationContext applicationContext) {
        for (GPHandlerMapping handlerMapping : this.handlerMappings) {
            this.handlerAdapterMap.put(handlerMapping, new GPHandlerAdapter());
        }
    }

    private void initThemeResolver(GPApplicationContext applicationContext) {

    }

    private void initLocaleResolver(GPApplicationContext applicationContext) {
    }

    private void initMultipartResolver(GPApplicationContext applicationContext) {
    }
}
