package com.xuww.springbootdemo.util;

/**
 * @Author: xuww
 * @Description:
 * @Date: Created 13:54 2018/8/16.
 * @Modifide BY
 * @Version: 1.0
 */
public class ManSayHelloWorld implements ISayHelloWorld {
    @Override
    public String say() {
        System.out.println("Hello world!");
        return "MAN";
    }
}
