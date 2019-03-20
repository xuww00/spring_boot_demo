package com.xuww.springbootdemo.util.study.DesignMode.Proxy.Static;

/**
 * @Author: xuww
 * @Description:
 * @Date: Created 14:40 2019/2/12.
 * @Modifide BY
 * @Version: 1.0
 */
public class ProxySubject implements Subject {
    private Subject subject;

    public ProxySubject(Subject subject) {
        this.subject = subject;
    }

    @Override
    public void visit() {
        subject.visit();
    }
}
