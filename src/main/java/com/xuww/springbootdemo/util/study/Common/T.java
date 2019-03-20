package com.xuww.springbootdemo.util.study.Common;

/**
 * @Author: xuww
 * @Description:
 * @Date: Created 11:26 2018/11/7.
 * @Modifide BY
 * @Version: 1.0
 */
public class T  extends Base{
    private int i = 22;
    public T(){
        i = 222;
    }
    @Override
    public void display() {
        System.out.println(i);
    }

    public static void main(String[] args) {
        T t = new T();
        t.display();
    }
}




