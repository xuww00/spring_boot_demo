package com.xuww.springbootdemo.util.study.BigDecimal;

import java.util.HashMap;

/**
 * @Author: xuww
 * @Description:
 * @Date: Created 15:15 2018/11/16.
 * @Modifide BY
 * @Version: 1.0
 */
public class BigDecimalTest {
    public static void main(String[] args)throws Exception {
        String i = null;
        String i1 = "";
        String i2 = "1";
        System.out.println("0.05 + 0.01 = " + ( 0.05 + 0.01));
        System.out.println("1.0 - 0.42 = " + ( 1.0 - 0.42));
        System.out.println("4.015 * 100 = " + (4.015 * 100) );
        System.out.println("123.3 / 100 = " + (123.3 / 100));
        try {
            System.out.println(i.hashCode());
        }catch (Exception e){

        }
        System.out.println(i1.hashCode());
        System.out.println(i2.hashCode());
        HashMap map = new HashMap();
    }
}
