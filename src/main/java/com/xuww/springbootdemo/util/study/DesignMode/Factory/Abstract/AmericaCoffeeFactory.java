package com.xuww.springbootdemo.util.study.DesignMode.Factory.Abstract;

import com.xuww.springbootdemo.util.study.DesignMode.Factory.*;

/**
 * @Author: xuww
 * @Description: 中国饮品工厂 制造咖啡与茶
 * @Date: Created 14:03 2019/2/13.
 * @Modifide BY
 * @Version: 1.0
 */
public class AmericaCoffeeFactory implements AbstractDrinksFactory {
    @Override
    public Coffee createCoffee() {
        // TODO Auto-generated method stub
        return new Latte();
    }

    @Override
    public Tea createTea() {
        // TODO Auto-generated method stub
        return new MilkTea();
    }

    @Override
    public Sodas createSodas() {
        // TODO Auto-generated method stub
        return null;
    }
}
