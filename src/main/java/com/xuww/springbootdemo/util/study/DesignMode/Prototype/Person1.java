package com.xuww.springbootdemo.util.study.DesignMode.Prototype;

/**
 * @Author: xuww
 * @Description:
 * @Date: Created 14:44 2019/2/15.
 * @Modifide BY
 * @Version: 1.0
 */
public class Person1 implements Cloneable {
    private String name;
    private boolean gender;
    private Interest interest;

    public Person1(String name, boolean gender, Interest interest) {
        this.name = name;
        this.gender = gender;
        this.interest = interest;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public Interest getInterest() {
        return interest;
    }

    public void setInterest(Interest interest) {
        this.interest = interest;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", interest=" + interest +
                '}';
    }

    protected Object clone() throws CloneNotSupportedException{
        Object obj = super.clone();  //直接调用object对象的clone()方法！
        //添加如下代码实现深复制(deep Clone)
        Person1 person = (Person1) obj;
        person.interest = (Interest)this.interest.clone(); //把属性也进行克隆！
        return obj;
    }

    public static void main(String[] args)throws CloneNotSupportedException {
        Interest interest = new Interest("摄影");
        Person1 gg = new Person1("gg",false,interest);
        System.out.println(gg);
        Person1 dxy = (Person1)gg.clone();
        dxy.setName("dxy");
        dxy.setGender(true);
        dxy.interest.setName("咖啡");
        System.out.println(dxy);
        System.out.println(gg);
    }
}
