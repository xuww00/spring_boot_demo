package com.xuww.springbootdemo.util.study.DesignMode.Delegat;

/**
 * @Author: xuww
 * @Description:
 * @Date: Created 13:38 2019/2/15.
 * @Modifide BY
 * @Version: 1.0
 */
public class TargetA implements ITarget{
    @Override
    public void doing(String command) {
        System.out.println("开始进行加密算法的实现");
    }
}
