package com.xuww.springbootdemo.util.study.DesignMode.Proxy.Static;

/**
 * @Author: xuww
 * @Description:
 * @Date: Created 14:41 2019/2/12.
 * @Modifide BY
 * @Version: 1.0
 */
public class Test {
    public static void main(String[] args) {
        ProxySubject subject = new ProxySubject(new RealSubject());
        subject.visit();
    }
}
