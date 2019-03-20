package com.xuww.springbootdemo.util.study.Reference;

import java.lang.ref.WeakReference;

/**
 * @Author: xuww
 * @Description: 弱引用
 * @Date: Created 16:57 2018/11/5.
 * @Modifide BY
 * @Version: 1.0
 */
public class ReferenceTest {
    public static void main(String[] args) {
        //创建一个字符串对象
        String str = new String("疯狂Java讲义");
        //创建一个弱引用，让此弱引用引用到"疯狂Java讲义"字符串
        WeakReference wr = new WeakReference(str);
        //切断str和"疯狂Java讲义"字符串之间的引用
        str = null;
        System.out.println(wr.get());
        //强制垃圾回收
        System.gc();
        System.runFinalization();
        //再次取出弱引用所引用的对象
        System.out.println(wr.get());

    }
}
