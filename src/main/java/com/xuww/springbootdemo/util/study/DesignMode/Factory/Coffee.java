package com.xuww.springbootdemo.util.study.DesignMode.Factory;

/**
 * @Author: xuww
 * @Description: 拿铁、美式咖啡、卡布奇诺等均为咖啡家族的一种产品 咖啡则作为一种抽象概念
 * @Date: Created 13:48 2019/2/13.
 * @Modifide BY
 * @Version: 1.0
 */
public abstract class Coffee extends Drink  {
    /**
     * 获取coffee名称
     * @return
     */
    public abstract String getName();
}
