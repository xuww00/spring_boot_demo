package com.xuww.springbootdemo.util.study.DesignMode.Factory.Abstract;

import com.xuww.springbootdemo.util.study.DesignMode.Factory.Coffee;
import com.xuww.springbootdemo.util.study.DesignMode.Factory.Sodas;
import com.xuww.springbootdemo.util.study.DesignMode.Factory.Tea;

/**
 * @Author: xuww
 * @Description: 多产品族
 * @Date: Created 14:16 2019/2/13.
 * @Modifide BY
 * @Version: 1.0
 */
public interface AbstractDrinksFactory {
    /**
     * 制造咖啡
     * @return
     */
    Coffee createCoffee();

    /**
     * 制造茶
     * @return
     */
    Tea createTea();

    /**
     * 制造碳酸饮料
     * @return
     */
    Sodas createSodas();
}
