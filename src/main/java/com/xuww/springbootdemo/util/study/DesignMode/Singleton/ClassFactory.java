package com.xuww.springbootdemo.util.study.DesignMode.Singleton;

/**
 * @Author: xuww
 * @Description: 内部枚举类实现
 * @Date: Created 10:59 2019/2/14.
 * @Modifide BY
 * @Version: 1.0
 */
public class ClassFactory {
    //内部枚举类
    private enum SingletonEnum{
        Singleton;
        private EnumSingleton single;

        //枚举类的构造方法在类加载时是被实例化
        private SingletonEnum(){
            single = new EnumSingleton();
        }

        public EnumSingleton getInstance(){
            return single;
        }
    }

    public static EnumSingleton getInstance(){
        return SingletonEnum.Singleton.getInstance();
    }
}
