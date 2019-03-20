package com.xuww.springbootdemo.util.study.Enum;

/**
 * @Author: xuww
 * @Description: 枚举实践
 * @Date: Created 13:57 2018/11/5.
 * @Modifide BY
 * @Version: 1.0
 */
public enum Operation {
    PLUS{
        public double eval(double x, double y){
            return x + y;
        }
    },
    TIMES{
        public double eval(double x, double y){
            return x * y;
        }
    },
    MINUS{
        public double eval(double x, double y){
            return x - y;
        }
    },
    DIVIDE{
        public double eval(double x, double y){
            return x / y;
        }
    };
    public abstract double eval(double x, double y);

    public static void main(String[] args) {
        System.out.println(PLUS.ordinal());
        System.out.println(MINUS.ordinal());
        System.out.println(TIMES.ordinal());
        System.out.println(DIVIDE.ordinal());
    }
}
