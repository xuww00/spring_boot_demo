package com.xuww.springbootdemo.util.study.DesignMode.Template;

/**
 * @Author: xuww
 * @Description: 汽车模型 模型模式
 * @Date: Created 13:43 2019/2/18.
 * @Modifide BY
 * @Version: 1.0
 */
public abstract class CarModel {
    /**
     * 汽车启动
     */
    protected abstract void start();

    /**
     * 停车
     */
    protected abstract void stop();

    /**
     * 用户并不需要关注你的车怎么启动或者怎么停下来，可以开可以停就可以了
     */
    final public void exct(){
        this.start();
        this.stop();
    }
}
