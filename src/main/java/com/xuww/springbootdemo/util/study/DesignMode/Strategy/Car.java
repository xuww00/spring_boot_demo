package com.xuww.springbootdemo.util.study.DesignMode.Strategy;

/**
 * @Author: xuww
 * @Description: 每个车都具有的相同的属性和行为
 * @Date: Created 15:01 2019/2/14.
 * @Modifide BY
 * @Version: 1.0
 */
public class Car implements CarFunction{
    protected String name;
    protected String color;
    private CarFunction carFunction;
    @Override
    public void run() {
        System.out.println(color +" " + name  +"在行驶。。。");
    }

    public Car(String name, String color) {
        this.color = color;
        this.name = name;
    }
}
