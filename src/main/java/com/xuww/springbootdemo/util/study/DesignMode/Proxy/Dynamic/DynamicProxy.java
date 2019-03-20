package com.xuww.springbootdemo.util.study.DesignMode.Proxy.Dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @Author: xuww
 * @Description:
 * @Date: Created 14:45 2019/2/12.
 * @Modifide BY
 * @Version: 1.0
 */
public class DynamicProxy implements InvocationHandler {
    private Object object;

    public DynamicProxy(Object object) {
        this.object = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result = method.invoke(object, args);
        return result;
    }
}
