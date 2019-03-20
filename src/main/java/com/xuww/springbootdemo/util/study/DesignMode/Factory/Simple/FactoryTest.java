package com.xuww.springbootdemo.util.study.DesignMode.Factory.Simple;

import com.xuww.springbootdemo.util.study.DesignMode.Factory.Americano;
import com.xuww.springbootdemo.util.study.DesignMode.Factory.Cappuccino;
import com.xuww.springbootdemo.util.study.DesignMode.Factory.Coffee;
import com.xuww.springbootdemo.util.study.DesignMode.Factory.Latte;

/**
 * @Author: xuww
 * @Description: 简单工厂--用于创建不同类型的咖啡实例
 * @Date: Created 13:50 2019/2/13.
 * @Modifide BY
 * @Version: 1.0
 */
public class FactoryTest {
    /**
     * @Description: 从工厂获取实例（将创建对象的控制权交给工厂）
     * @Date: Created 13:53 2019/2/13
     */
    public static Coffee createInstance(String type){
        if ("americano".equals(type)){
            return new Americano();
        }else if ("cappuccino".equals(type)){
            return new Cappuccino();
        }else if ("latte".equals(type)){
            return new Latte();
        }else {
            throw new RuntimeException("type is not illegal");
        }
    }

    public static void main(String[] args) {
        Coffee latte = FactoryTest.createInstance("latte");
        System.out.println(latte.getName());
        Coffee cappuccino = FactoryTest.createInstance("cappuccino");
        System.out.println(cappuccino.getName());
    }
}
