package com.xuww.springbootdemo.util.study.DesignMode.Factory.General;

import com.xuww.springbootdemo.util.study.DesignMode.Factory.Cappuccino;
import com.xuww.springbootdemo.util.study.DesignMode.Factory.Coffee;
import com.xuww.springbootdemo.util.study.DesignMode.Factory.Latte;

/**
 * @Author: xuww
 * @Description: 中国咖啡工厂
 * @Date: Created 14:01 2019/2/13.
 * @Modifide BY
 * @Version: 1.0
 */
public class ChinaCoffeeFactory extends CoffeeFactory {
    @Override
    public Coffee[] createCoffee() {
        return new Coffee[]{new Cappuccino(), new Latte()};
    }
}
