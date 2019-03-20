package com.xuww.springbootdemo.util.study.DesignMode.Proxy.Static;

/**
 * @Author: xuww
 * @Description: 实现一个真正的委托类，即静态代理的（RealSubject类）
 * @Date: Created 14:39 2019/2/12.
 * @Modifide BY
 * @Version: 1.0
 */
public class RealSubject implements Subject {
    private String name = "byhieg";
    @Override
    public void visit() {
        System.out.println(name);
    }
}
