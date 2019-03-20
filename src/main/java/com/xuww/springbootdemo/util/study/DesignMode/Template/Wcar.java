package com.xuww.springbootdemo.util.study.DesignMode.Template;

/**
 * @Author: xuww
 * @Description: 大众车
 * @Date: Created 13:46 2019/2/18.
 * @Modifide BY
 * @Version: 1.0
 */
public class Wcar extends CarModel{
    @Override
    protected void start() {
        System.out.println("大众车启动 。。。。。。。。突突突");
    }

    @Override
    protected void stop() {
        System.out.println("大众车停车。。。。。。。。。");
    }
}
