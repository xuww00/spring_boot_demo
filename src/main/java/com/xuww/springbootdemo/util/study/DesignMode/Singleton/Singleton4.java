package com.xuww.springbootdemo.util.study.DesignMode.Singleton;

/**
 * @Author: xuww
 * @Description: static静态代码块实现
 * @Date: Created 10:57 2019/2/14.
 * @Modifide BY
 * @Version: 1.0
 */
public class Singleton4 {
    //私有构造器
    private Singleton4() {}

    private static Singleton4 single = null;

    static {
        single = new Singleton4();
    }

    public static Singleton4 getInstance(){
        return single;
    }
}
