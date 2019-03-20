package com.xuww.springbootdemo.util.study.DesignMode.Factory.General;

import com.xuww.springbootdemo.util.study.DesignMode.Factory.Americano;
import com.xuww.springbootdemo.util.study.DesignMode.Factory.Coffee;
import com.xuww.springbootdemo.util.study.DesignMode.Factory.Latte;

/**
 * @Author: xuww
 * @Description:
 * @Date: Created 14:03 2019/2/13.
 * @Modifide BY
 * @Version: 1.0
 */
public class AmericaCoffeeFactory extends CoffeeFactory {
    @Override
    public Coffee[] createCoffee() {
        return new Coffee[]{new Americano(), new Latte()};
    }
}
