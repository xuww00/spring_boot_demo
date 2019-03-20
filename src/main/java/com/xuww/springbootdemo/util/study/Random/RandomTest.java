package com.xuww.springbootdemo.util.study.Random;

import java.util.concurrent.ThreadLocalRandom;

/**
 * @Author: xuww
 * @Description:
 * @Date: Created 10:10 2018/11/20.
 * @Modifide BY
 * @Version: 1.0
 */
public class RandomTest {
    public static void main(String[] args) {
        ThreadLocalRandom random = ThreadLocalRandom.current();
        for (int i = 0; i < 100; i++){
            System.out.println(random.nextInt(2));
        }
    }
}
