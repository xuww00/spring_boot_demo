package com.xuww.springbootdemo.util.study.GarbageCollection;

/**
 * @Author: xuww
 * @Description: 对象与垃圾回收
 * @Date: Created 16:44 2018/11/5.
 * @Modifide BY
 * @Version: 1.0
 */
public class Test {
    public static void main(String[] arg){
        for (int i = 0; i < 4; i++){
            new Test();
            Runtime.getRuntime().gc();
        }
    }
    public void finalize(){
        System.out.println("系统正在清理Test对象的资源");
    }
}
