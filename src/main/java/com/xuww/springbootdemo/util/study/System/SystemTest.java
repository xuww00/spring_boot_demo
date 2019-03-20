package com.xuww.springbootdemo.util.study.System;

import java.io.FileOutputStream;
import java.util.Map;
import java.util.Properties;

/**
 * @Author: xuww
 * @Description:
 * @Date: Created 17:32 2018/11/5.
 * @Modifide BY
 * @Version: 1.0
 */
public class SystemTest {
    public static void main(String[] args) throws Exception{
        //获取系统所有的环境变量
        Map<String, String> env = System.getenv();
        for (String name : env.keySet()){
            System.out.println(name + "--->" + env.get(name));
        }
        //获取指定环境变量的值
        System.out.println(System.getenv("JAVA_HOME"));
        //获取所有的系统属性
        Properties properties = System.getProperties();
        //将所有的系统属性保存到props.txt文件中
        properties.store(new FileOutputStream("props.txt"), "System Properties");
        //输出特定的系统属性
        System.out.println(System.getProperty("os.name"));
    }
}
