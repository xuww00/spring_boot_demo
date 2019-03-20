package com.xuww.springbootdemo.util.study.Timer;

import java.util.TimerTask;

/**
 * @Author: xuww
 * @Description:
 * @Date: Created 17:54 2018/12/13.
 * @Modifide BY
 * @Version: 1.0
 */
public class RemindTask extends TimerTask {
    public void run() {
        System.out.println("你指定2013-11-27号15:34:01分执行已经触发！");
        cancel();
    }
}
