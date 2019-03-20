package com.xuww.springbootdemo.util.study.DesignMode.Singleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;

/**
 * @Author: xuww
 * @Description:
 * @Date: Created 11:15 2019/2/14.
 * @Modifide BY
 * @Version: 1.0
 */
public class Test {
    public static void main(String[] args)throws Exception {
        Singleton1 singleton1 = Singleton1.getInstance();
        Singleton1 singleton2 = Singleton1.getInstance();

        System.out.println(singleton1);
        System.out.println(singleton2);

        //使用反射机制直接调用私有构造器
        Class<Singleton1> clazz = (Class<Singleton1>)Class.forName("com.xuww.springbootdemo.util.study.DesignMode.Singleton.Singleton1");
        Constructor<Singleton1> c = clazz.getDeclaredConstructor(null);
        c.setAccessible(true);//绕过权限管理，即在true的情况下，可以通过构造函数新建对象
        Singleton1 singleton3 = c.newInstance();
        Singleton1 singleton4 = c.newInstance();

        System.out.println(singleton3);
        System.out.println(singleton4);

        //通过反序列化的方式创建多个对象
        FileOutputStream fos= new FileOutputStream("d:/a.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(singleton1);
        oos.close();
        fos.close();
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("d:/a.txt"));
        Singleton1 s5= (Singleton1) ois.readObject();
        System.out.println(s5);
    }
}
