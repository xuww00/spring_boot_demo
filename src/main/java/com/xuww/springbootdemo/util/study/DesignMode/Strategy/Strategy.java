package com.xuww.springbootdemo.util.study.DesignMode.Strategy;

/**
 * @Author: xuww
 * @Description: 运行环境类:Strategy
 * @Date: Created 15:05 2019/2/14.
 * @Modifide BY
 * @Version: 1.0
 */
public class Strategy {

    public static void main(String[] args) {
        Car smallCar = new SmallCar("路虎","黑色");
        Car bussCar = new BussCar("公交车","白色");
        Person p1 = new Person("小明", 20);
        p1.driver(smallCar);
        p1.driver(bussCar);
    }
}
