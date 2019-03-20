package com.xuww.springbootdemo.util.study.DesignMode.Factory.Abstract;

import com.xuww.springbootdemo.util.study.DesignMode.Factory.*;

/**
 * @Author: xuww
 * @Description: 中国咖啡工厂
 * @Date: Created 14:01 2019/2/13.
 * @Modifide BY
 * @Version: 1.0
 */
public class ChinaCoffeeFactory implements AbstractDrinksFactory {
    @Override
    public Coffee createCoffee() {
        // TODO Auto-generated method stub
        return new Latte();
    }

    @Override
    public Tea createTea() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Sodas createSodas() {
        // TODO Auto-generated method stub
        return new CocaCola();
    }
}
