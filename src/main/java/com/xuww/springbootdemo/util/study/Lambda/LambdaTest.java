package com.xuww.springbootdemo.util.study.Lambda;

import java.util.Collection;
import java.util.HashSet;

/**
 * @Author: xuww
 * @Description:
 * @Date: Created 17:12 2018/11/16.
 * @Modifide BY
 * @Version: 1.0
 */
public class LambdaTest {
    public static void main(String[] args) {
        test1();
    }
    static void test1(){
        Collection books = new HashSet();
        books.add("123");
        books.add("1234");
        books.add("1235");

//        Iterator iterator = books.iterator();
//        iterator.forEachRemaining(obj -> System.out.println(obj));
//
        books.removeIf(ele -> ((String)ele).length() >= 4);
        books.forEach(obj -> {
            System.out.println(obj);
        });


    }
}
