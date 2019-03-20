package com.xuww.springbootdemo.util.study.Common;

/**
 * @Author: xuww
 * @Description:
 * @Date: Created 11:49 2018/11/7.
 * @Modifide BY
 * @Version: 1.0
 */
public class Test {
    public static int test(){
        int count = 2;
        try {
            System.out.println(count);
            return count+1;

        }finally{
            count++;
            return count;
        }
    }
    public static void main(String[] args) {
        System.out.println(test());
    }

}
