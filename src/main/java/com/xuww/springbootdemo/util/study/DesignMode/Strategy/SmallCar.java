package com.xuww.springbootdemo.util.study.DesignMode.Strategy;

/**
 * @Author: xuww
 * @Description: 具体策略实现子类
 * @Date: Created 15:02 2019/2/14.
 * @Modifide BY
 * @Version: 1.0
 */
public class SmallCar extends Car {
    public SmallCar(String name, String color) {
        super(name, color);
    }

    public void run(){
        System.out.println(color +" " + name  +"在高速的行驶。。。");
    }
}
