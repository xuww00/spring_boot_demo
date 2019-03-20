package com.xuww.springbootdemo.util.study.DesignMode.Singleton;

import java.io.Serializable;

/**
 * @Author: xuww
 * @Description: 饿汉式单例（立即加载方式）
 * @Date: Created 17:00 2019/2/13.
 * @Modifide BY
 * @Version: 1.0
 */
public class Singleton1 implements Serializable {
    //私有构造器
    private Singleton1() {
        if (singleton1 != null){
            throw new RuntimeException();
        }
    }

    private static Singleton1 singleton1 = new Singleton1();

    //静态工厂方法
    public static Singleton1 getInstance(){
        return singleton1;
    }

//    public Object readResolve(){
//        return singleton1;
//    }
}
