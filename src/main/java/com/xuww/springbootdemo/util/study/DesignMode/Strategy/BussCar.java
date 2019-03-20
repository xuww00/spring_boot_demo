package com.xuww.springbootdemo.util.study.DesignMode.Strategy;

/**
 * @Author: xuww
 * @Description:
 * @Date: Created 15:04 2019/2/14.
 * @Modifide BY
 * @Version: 1.0
 */
public class BussCar extends Car{
    public BussCar(String name, String color) {
        super(name, color);
    }

    public void run() {
        System.out.println(color +" " + name  +"在缓慢的行驶。。。");
    }
}
