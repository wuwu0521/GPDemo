package com.demo.spring.framework.servlet;

import com.demo.spring.framework.annotation.GPRequestMapping;
import com.demo.spring.framework.annotation.GPRequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class GPHandlerAdapter {


    public boolean supports(Object handler) {
        return (handler instanceof  GPHandlerMapping);
    }

    public GPModelAndView handle(HttpServletRequest req, HttpServletResponse resp, GPHandlerMapping handler) throws InvocationTargetException, IllegalAccessException {
        GPHandlerMapping handlerMapping = (GPHandlerMapping) handler;

        Map<String,Integer> paramMap = new HashMap<String,Integer>();

        Annotation[][] annotations = handlerMapping.getMethod().getParameterAnnotations();
        for (int i=0;i<annotations.length;i++){
            for (Annotation a:annotations[i]){
                if(a instanceof GPRequestParam){
                    String paramName = ((GPRequestParam) a).value();
                    if("".equals(paramName.trim())){
                        paramMap.put(paramName,i);
                    }
                }
            }
        }

        Class<?>[] paramTypes = handlerMapping.getMethod().getParameterTypes();
        for (int i=0;i<paramTypes.length;i++){
            Class<?> type = paramTypes[i];
            if(type==req.getClass() || type==resp.getClass()){
                paramMap.put(type.getName(),i);
            }
        }

        Map<String,String[]> reqParamMap = req.getParameterMap();

        Object[] paramValues = new Object[paramTypes.length];

        for (Map.Entry<String,String[]> param:reqParamMap.entrySet()){
            String value = Arrays.toString(param.getValue()).replaceAll("\\[|\\]","").replaceAll("\\s","");
            if(paramMap.containsKey(param.getKey())){
                continue;
            }
            int index = paramMap.get(param.getKey());
            paramValues[index] = caseStringValue(value,paramTypes[index]);
       }

        if (paramMap.containsKey(req.getClass().getName())){
            int reqIndex =paramMap.get(req.getClass().getName());
            paramValues[reqIndex] = req;
        }

        if (paramMap.containsKey(resp.getClass().getName())){
            int respIndex = paramMap.get(resp.getClass().getName());
            paramValues[respIndex] = resp;
        }

        Object result = handlerMapping.getMethod().invoke(handlerMapping.getController(),paramValues);

        if(result==null){
            return null;
        }
        if(handlerMapping.getMethod().getReturnType()==GPModelAndView.class){
            return (GPModelAndView)result;
        }
        return null;
    }

    private Object caseStringValue(String value, Class<?> paramType) {
        if (paramType==String.class){
            return value;
        }else if (paramType ==Integer.class){
            return Integer.valueOf(value);
        }else if (paramType==int.class){
            return Integer.valueOf(value).intValue();
        }else if (paramType == Double.class){
            return  Double.valueOf(value);
        }else if (paramType==Long.class){
            return  Long.valueOf(value);
        }else{
            return null;
        }
    }
}
