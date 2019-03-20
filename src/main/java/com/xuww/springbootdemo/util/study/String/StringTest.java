package com.xuww.springbootdemo.util.study.String;

import java.math.BigDecimal;

/**
 * @Author: xuww
 * @Description:
 * @Date: Created 9:44 2018/11/7.
 * @Modifide BY
 * @Version: 1.0
 */
public class StringTest {
    private static final String TEXT = "hai";
    public static void main(String[] args) {
        String text = "hai";
        String text2 = "hai";
        String text3 = "h" + "ai";
        String text4 = new String("hai");
        System.out.println(text == text2);
        System.out.println(text == text3);
        System.out.println(text == text4);
        System.out.println(text == text4.intern());
        System.out.println(TEXT == text);
        System.out.println((new BigDecimal(10000)).subtract(new BigDecimal(1000)).divide(BigDecimal.TEN));

    }
}
