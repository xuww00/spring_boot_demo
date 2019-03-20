package com.xuww.springbootdemo.util.study.Thread;

/**
 * @Author: xuww
 * @Description:
 * @Date: Created 13:43 2018/11/7.
 * @Modifide BY
 * @Version: 1.0
 */
public class TMain {
    int j=1;
    public synchronized void inc(){
        j++;
        System.out.println(Thread.currentThread().getName()+"-inc:"+j);
    }
    class T1 implements Runnable{
        public void run(){
            inc();
        }
    }
    public synchronized void dec(){
        j--;
        System.out.println(Thread.currentThread().getName()+"-dec:"+j);
    }
    class T11 implements Runnable{
        public void run(){
            dec();
        }
    }
    public static void main(String[] args) {
        System.out.println(10/4);


    }
}
