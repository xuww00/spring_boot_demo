package com.xuww.springbootdemo.util.study.DesignMode.Proxy.Dynamic;

import java.lang.reflect.Proxy;

/**
 * @Author: xuww
 * @Description:
 * @Date: Created 14:41 2019/2/12.
 * @Modifide BY
 * @Version: 1.0
 */
public class Test {
    public static void main(String[] args) {
        Subject real = new RealSubject();
        DynamicProxy proxy = new DynamicProxy(real);
        ClassLoader classLoader = real.getClass().getClassLoader();
        Subject subject = (Subject) Proxy.newProxyInstance(classLoader, new Class[]{Subject.class}, proxy);
        subject.visit();
    }
}
