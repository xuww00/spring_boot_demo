package com.xuww.springbootdemo.util.study.DesignMode.Prototype;

/**
 * @Author: xuww
 * @Description:
 * @Date: Created 14:23 2019/2/15.
 * @Modifide BY
 * @Version: 1.0
 */
public class Person implements Cloneable {
    private String name;
    private boolean gender;
    private Interest interest;

    public Person(String name, boolean gender, Interest interest) {
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
        return super.clone();
    }

    public static void main(String[] args)throws CloneNotSupportedException {
        Interest interest = new Interest("摄影");
        Person gg = new Person("gg", false, interest);
        System.out.println(gg);
        Person dxy = (Person)gg.clone();
        dxy.setName("dxy");
        dxy.setGender(true);
        dxy.getInterest().setName("咖啡");
        System.out.println(dxy);
        System.out.println(gg);
    }
}
