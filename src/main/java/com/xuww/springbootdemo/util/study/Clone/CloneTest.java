package com.xuww.springbootdemo.util.study.Clone;

/**
 * @Author: xuww
 * @Description:
 * @Date: Created 17:49 2018/11/5.
 * @Modifide BY
 * @Version: 1.0
 */
 class User implements Cloneable{
    int age;
    Address address;
    public User(int age){
        this.age = age;
        address = new Address("广州天河");
    }
    //通过调用super.clone()来实现clone方法；
    public CloneTest clone()throws CloneNotSupportedException{
        return (CloneTest)super.clone();
    }
}
public class CloneTest{
    public static void main(String[] args) {

    }
}

