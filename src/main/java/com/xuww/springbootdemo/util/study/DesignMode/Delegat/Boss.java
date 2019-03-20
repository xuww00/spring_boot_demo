package com.xuww.springbootdemo.util.study.DesignMode.Delegat;

/**
 * @Author: xuww
 * @Description:
 * @Date: Created 13:35 2019/2/15.
 * @Modifide BY
 * @Version: 1.0
 */
public class Boss {
    public static void main(String[] args) {
        new Leader().dispatch("销售");
        new Leader().dispatch("加密");
    }
}
