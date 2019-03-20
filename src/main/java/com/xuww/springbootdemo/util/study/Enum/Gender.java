package com.xuww.springbootdemo.util.study.Enum;

/**
 * @Author: xuww
 * @Description: 通过枚举类，获取对应枚举值
 * @Date: Created 13:45 2018/11/5.
 * @Modifide BY
 * @Version: 1.0
 */
public enum  Gender implements GenderDesc {
    MALE("男","123"){
        public void info(){
            System.out.println("这个枚举值代表男性");
        }
    },
    FEMAIL("女","12"){
        public void info(){
            System.out.println("这个枚举值代表女性");
        }
    };
    private final String name;
    private final String age;
    private Gender (String name,String age){
        this.name = name;
        this.age = age;
    }
    public String getName(){
        return this.name;
    }

    public String getAge() {
        return age;
    }
}
