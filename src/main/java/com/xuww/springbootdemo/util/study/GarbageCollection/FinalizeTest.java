package com.xuww.springbootdemo.util.study.GarbageCollection;

/**
 * @Author: xuww
 * @Description: 对象与垃圾回收
 * @Date: Created 16:49 2018/11/5.
 * @Modifide BY
 * @Version: 1.0
 */
public class FinalizeTest {
    private static FinalizeTest ft = null;
    public void info(){
        System.out.println("测试资源清理的finalize方法");
    }
    public static void main(String[] arg) throws Exception{
        new FinalizeTest();
//        通知系统进行垃圾回收
        System.gc();
//        强制垃圾回收机制调用可恢复对象的finalize方法
//        Runtime.getRuntime().runFinalization();
        System.runFinalization();
        ft.info();
    }
    public void finalize(){
        //让ft引用试图回收的可恢复对象，即可恢复对象重新变成可达
        ft = this;
    }
}
