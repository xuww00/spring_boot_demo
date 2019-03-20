package com.xuww.springbootdemo.util.study.DesignMode.Factory.General;

import com.xuww.springbootdemo.util.study.DesignMode.Factory.Coffee;

/**
 * @Author: xuww
 * @Description:
 * @Date: Created 14:04 2019/2/13.
 * @Modifide BY
 * @Version: 1.0
 */
public class Test {
    static void print(Coffee[] c){
        for (Coffee coffee : c){
            System.out.println(coffee.getName());
        }
    }
    public static void main(String[] args) {
        CoffeeFactory chinaCoffeeFactory = new ChinaCoffeeFactory();
        Coffee[] chinaCoffees = chinaCoffeeFactory.createCoffee();
        System.out.println("中国咖啡工厂可以生产的咖啡有：");
        print(chinaCoffees);
        CoffeeFactory americaCoffeeFactory = new AmericaCoffeeFactory();
        Coffee[] americaCoffees = americaCoffeeFactory.createCoffee();
        System.out.println("美国咖啡工厂可以生产的咖啡有：");
        print(americaCoffees);
    }
}
