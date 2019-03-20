package com.xuww.springbootdemo.util.study.SpringMvc.servlet;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.*;

/**
 * @Author: xuww
 * @Description:
 * @Date: Created 16:04 2019/2/12.
 * @Modifide BY
 * @Version: 1.0
 */
public class MyDispatcherServlet extends HttpServlet{

    private Properties properties = new Properties();

    private List<String> classNames = new ArrayList<>();

    private Map<String, Object> ioc = new HashMap<>();

    private Map<String, Method> handlerMapping = new HashMap<>();

    private Map<String, Object> controllerMap = new HashMap<>();

    @Override
    public void init(ServletConfig config) throws ServletException{
        //1、加载配置文件
    }

    @Override
    protected  void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException{
        this.doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException{
        try {
            //处理请求
            doDispatch(request, response);
        }catch (Exception e){
            response.getWriter().write("500！！ Server Exception");
        }
    }

    private void doDispatch(HttpServletRequest request, HttpServletResponse response)throws  Exception{
        if(handlerMapping.isEmpty()){
            return;
        }

        String url = request.getRequestURI();
        String contextPath = request.getContextPath();

        //拼接url并把多个/替换成一个
        url = url.replace(contextPath, "").replaceAll("/+", "/");

        if (!this.handlerMapping.containsKey(url)){
            response.getWriter().write("404 NOT FUND");
            return;
        }

        Method method = this.handlerMapping.get(url);

        //获取方法的参数列表
        Class<?>[] parameterTypes = method.getParameterTypes();

        //获取请求的参数
        Map<String, String[]> parameterMap = request.getParameterMap();

        //保存参数值
        Object[] paramValues = new Object[parameterTypes.length];

        //方法的参数列表
        for (int i = 0; i < parameterTypes.length; i++){
            //根据参数名称，做某些处理
            String requestParam = parameterTypes[i].getSimpleName();

            if (requestParam.equals("HttpServletRequest")){
                //参数类型已明确
                paramValues[i] = request;
                continue;
            }

            if (requestParam.equals("HttpServletResponse")){
                paramValues[i]=response;
                continue;
            }

            if(requestParam.equals("String")){
                for (Map.Entry<String, String[]> param : parameterMap.entrySet()) {
                    String value =Arrays.toString(param.getValue()).replaceAll("\\[|\\]", "").replaceAll(",\\s", ",");
                    paramValues[i]=value;
                }
            }
        }
        //利用反射机制来调用
        try {
            method.invoke(this.controllerMap.get(url), paramValues);//obj是method所对应的实例 在ioc容器中
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    private void doLoadConfig(String location){
        //把web.xml的contextConfigLocation对应的value值加载到流里面
        InputStream resourceAsStream = this.getClass().getClassLoader().getResourceAsStream(location);
        try {
            //用Properties文件加载文件内容
            properties.load(resourceAsStream);
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            //关流
            if (null != resourceAsStream){
                try {
                    resourceAsStream.close();
                }catch (IOException e){
                    e.printStackTrace();
                }
            }
        }
    }

    private void doScanner(String packageName){

    }
}
