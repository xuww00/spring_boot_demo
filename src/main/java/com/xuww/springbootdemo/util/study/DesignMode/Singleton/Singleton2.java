package com.xuww.springbootdemo.util.study.DesignMode.Singleton;

/**
 * @Author: xuww
 * @Description: 懒汉式单例（延迟加载方式）
 * @Date: Created 17:04 2019/2/13.
 * @Modifide BY
 * @Version: 1.0
 */
public class Singleton2 {

    //私有构造器
    private Singleton2() {}
    //定义一个静态私有变量(不初始化，不使用final关键字，
    // 使用volatile保证了多线程访问时instance变量的可见性，避免了instance初始化时其他变量属性还没赋值完时，被另外线程调用)
    private static volatile Singleton2 single = null;

    public static Singleton2 getInstance (){
        if (single == null){
            // 等同于 synchronized public static Singleton2 getInstance()
            synchronized (Singleton2.class){
                // 注意：里面的判断是一定要加的，否则出现线程安全问题
                if (single == null){
                    single = new Singleton2();
                }
            }
        }
        return single;
    }
}
