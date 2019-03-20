package com.xuww.springbootdemo.util.study.DesignMode.Singleton;

/**
 * @Author: xuww
 * @Description: 静态内部类实现
 * @Date: Created 10:25 2019/2/14.
 * @Modifide BY
 * @Version: 1.0
 */
public class Singleton3 {
    //私有构造器
    private Singleton3() {}

    // 静态内部类
    private static class InnerObject{
        private static Singleton3 single = new Singleton3();
    }

    public static Singleton3 getInstance(){
        return InnerObject.single;
    }
}
