package com.xuww.springbootdemo.util.study.Time;

import java.time.Clock;
import java.time.DayOfWeek;

/**
 * @Author: xuww
 * @Description:
 * @Date: Created 15:41 2018/11/16.
 * @Modifide BY
 * @Version: 1.0
 */
public class TimeTest {
    public static void main(String[] args) {
        Clock clock = Clock.systemDefaultZone();
        System.out.println(DayOfWeek.TUESDAY.getValue());

    }
}
