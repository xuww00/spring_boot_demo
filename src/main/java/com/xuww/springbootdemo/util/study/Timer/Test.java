package com.xuww.springbootdemo.util.study.Timer;

import java.util.Calendar;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * @Author: xuww
 * @Description:
 * @Date: Created 17:53 2018/12/13.
 * @Modifide BY
 * @Version: 1.0
 */
public class Test {
    public static void main(String[] args) {

        Timer test = new Timer();

        Calendar calendar = Calendar.getInstance();
        /**
         * 10秒后触发定时任务
         */
        calendar.add(Calendar.SECOND, 10);
        Date time = calendar.getTime();

        test.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("你指定2013-11-27号15:34:01分执行已经触发！");
                test.cancel();
            }
        }, time);


    }
}
