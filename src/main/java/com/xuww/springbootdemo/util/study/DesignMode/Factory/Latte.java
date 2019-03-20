package com.xuww.springbootdemo.util.study.DesignMode.Factory;

import com.xuww.springbootdemo.util.study.DesignMode.Factory.Coffee;

/**
 * @Author: xuww
 * @Description:
 * @Date: Created 13:49 2019/2/13.
 * @Modifide BY
 * @Version: 1.0
 */
public class Latte extends Coffee {
    @Override
    public String getName() {
        return "拿铁";
    }
}
