package com.xuww.springbootdemo.util.study.DesignMode.Template;

/**
 * @Author: xuww
 * @Description: 客户端
 * @Date: Created 13:48 2019/2/18.
 * @Modifide BY
 * @Version: 1.0
 */
public class Client {
    public static void main(String[] args) {
        CarModel wcar = new Wcar();
        wcar.exct();

        CarModel ocar = new Ocar();
        ocar.exct();
    }
}
