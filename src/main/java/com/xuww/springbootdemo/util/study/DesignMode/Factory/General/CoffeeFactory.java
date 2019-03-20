package com.xuww.springbootdemo.util.study.DesignMode.Factory.General;

import com.xuww.springbootdemo.util.study.DesignMode.Factory.Coffee;

/**
 * @Author: xuww
 * @Description: 定义一个抽象的咖啡工厂 生产可制造的咖啡（单一产品结构）
 * @Date: Created 14:00 2019/2/13.
 * @Modifide BY
 * @Version: 1.0
 */
public abstract class CoffeeFactory {
    /**
     * 生产可制造的咖啡
     * @return
     */
    public abstract Coffee[] createCoffee();
}
