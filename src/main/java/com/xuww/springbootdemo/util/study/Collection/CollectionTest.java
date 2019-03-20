package com.xuww.springbootdemo.util.study.Collection;

import java.util.*;

/**
 * @Author: xuww
 * @Description:
 * @Date: Created 13:46 2018/11/19.
 * @Modifide BY
 * @Version: 1.0
 */
public class CollectionTest {
    public static void main(String[] args) {
        List set = new ArrayList<>();

        Integer a = 1;
        Integer b = 2;
        Integer c = 3;

        set.add(a);
        set.add(b);
        set.add(c);
        //Collections.shuffle 将集合中的元素 进行随机排序
        Collections.shuffle(set);
        System.out.println(Collections.max(set));
        //定义线程安全的 集合
        Collection collection = Collections.synchronizedCollection(new ArrayList<>());
        List list = Collections.synchronizedList(new ArrayList<>());
        Set set1 = Collections.synchronizedSet(new HashSet<>());
        Map m = Collections.synchronizedMap(new HashMap<>());


        Map<Object, String> map = new HashMap<>();
        map.put(null, "1");
        System.out.println(map.get(null));
        map.put(null, "2");
        System.out.println(map.get(null));
        System.out.println(map.get(null));
        System.out.println(map.get(null));

    }

}
