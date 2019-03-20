package com.xuww.springbootdemo.util.study.DesignMode.Prototype;

/**
 * @Author: xuww
 * @Description:
 * @Date: Created 14:24 2019/2/15.
 * @Modifide BY
 * @Version: 1.0
 */
public class Interest implements Cloneable{
    private String name;

    public Interest(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Interest{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
