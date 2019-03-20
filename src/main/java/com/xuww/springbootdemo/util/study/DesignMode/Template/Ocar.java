package com.xuww.springbootdemo.util.study.DesignMode.Template;

/**
 * @Author: xuww
 * @Description: Audi
 * @Date: Created 13:47 2019/2/18.
 * @Modifide BY
 * @Version: 1.0
 */
public class Ocar extends CarModel {
    @Override
    protected void start() {
        System.out.println("奥迪  无匙启动               突突突");
    }

    @Override
    protected void stop() {
        System.out.println("奥迪  停车              ");
    }
}
