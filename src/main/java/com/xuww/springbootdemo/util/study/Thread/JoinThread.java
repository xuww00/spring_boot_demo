package com.xuww.springbootdemo.util.study.Thread;

/**
 * @Author: xuww
 * @Description:
 * @Date: Created 9:58 2018/11/28.
 * @Modifide BY
 * @Version: 1.0
 */
public class JoinThread extends Thread{
    public JoinThread(String name){
        super(name);
    }

    public void run(){
        for (int i = 0; i< 100; i++){
            System.out.println(getName() + " " + i);
        }
    }

    public static void main(String[] args)throws Exception {
        new JoinThread("新线程").start();
        for (int i = 0; i< 100; i++){
            if(i == 20){
                JoinThread jt = new JoinThread("被Join的线程");
                jt.start();
                jt.join();
            }
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }
}
