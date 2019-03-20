package com.xuww.springbootdemo.util.study.Thread;

/**
 * @Author: xuww
 * @Description:
 * @Date: Created 20:54 2018/11/23.
 * @Modifide BY
 * @Version: 1.0
 */
public class ThreadExceptionTest implements Runnable{
    @Override
    public void run() {
        test1();
    }

    public void test1(){
        test2();
    }

    public void test2(){
        int a = 5;
        int b = 0;
        int c = a / b;
    }

    public static void main(String[] args) {
        new Thread(new ThreadExceptionTest()).start();
    }
}
