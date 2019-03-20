package com.xuww.springbootdemo.util.study.DesignMode.Factory.Abstract;

import com.xuww.springbootdemo.util.study.DesignMode.Factory.Coffee;
import com.xuww.springbootdemo.util.study.DesignMode.Factory.Drink;
import com.xuww.springbootdemo.util.study.DesignMode.Factory.Sodas;
import com.xuww.springbootdemo.util.study.DesignMode.Factory.Tea;

/**
 * @Author: xuww
 * @Description:
 * @Date: Created 14:25 2019/2/13.
 * @Modifide BY
 * @Version: 1.0
 */
public class Test {
    static void print(Drink drink){
        if(drink == null){
            System.out.println("产品：--" );
        }else{
            System.out.println("产品：" + drink.getName());
        }
    }

    public static void main(String[] args) {
        AbstractDrinksFactory chinaDrinksFactory = new ChinaCoffeeFactory();
        Coffee coffee = chinaDrinksFactory.createCoffee();
        Tea tea = chinaDrinksFactory.createTea();
        Sodas sodas = chinaDrinksFactory.createSodas();
        System.out.println("中国饮品工厂有如下产品：");
        print(coffee);
        print(tea);
        print(sodas);

        AbstractDrinksFactory americaDrinksFactory = new AmericaCoffeeFactory();
        coffee = americaDrinksFactory.createCoffee();
        tea = americaDrinksFactory.createTea();
        sodas = americaDrinksFactory.createSodas();
        System.out.println("美国饮品工厂有如下产品：");
        print(coffee);
        print(tea);
        print(sodas);
    }

}
