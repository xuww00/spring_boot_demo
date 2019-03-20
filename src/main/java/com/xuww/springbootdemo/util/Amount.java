package com.xuww.springbootdemo.util;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * @author zhangmingshuang
 * @date 2018/1/26 17:00
 * @description 金额转化工具类
 */
public class Amount {
    /**
     * 100
     */
    public static final BigDecimal HUNDRED = new BigDecimal(100);
    public static final boolean OUT = false;
    public static final boolean IN = true;
    /**
     * 资金流入
     */
    public static final int DIRECTION_IN = 1;
    /**
     * 资金流出
     */
    public static final int DIRECTION_OUT = 0;
    /**
     * 保留小数点
     */
    public static final int KEEP_SCALE = 7;

    /**
     * 分到元
     *
     * @return
     */
    public static BigDecimal toDollar(long penny) {
        return new BigDecimal(penny / 100D).setScale(KEEP_SCALE, BigDecimal.ROUND_HALF_DOWN);
    }

    /**
     * 判断 a < b
     *
     * @param a
     * @param b
     * @return
     */
    public static boolean lessThan(BigDecimal a, BigDecimal b) {
        if (a == null) {
            return true;
        }
        if (b == null) {
            return false;
        }
        return a.compareTo(b) == -1;
    }

    /**
     * a <= b
     *
     * @param a
     * @param b
     * @return
     */
    public static boolean lessEqual(BigDecimal a, BigDecimal b) {
        if (a == null) {
            return true;
        }
        if (b == null) {
            return false;
        }
        return a.compareTo(b) != 1;
    }

    /**
     * a = b
     *
     * @param a
     * @param b
     * @return
     */
    public static boolean equalTo(BigDecimal a, BigDecimal b) {
        if (a == null) {
            return false;
        }
        if (b == null) {
            return false;
        }
        return a.compareTo(b) == 0;
    }

    /**
     * a > b
     *
     * @param a
     * @param b
     * @return
     */
    public static boolean greaterThan(BigDecimal a, BigDecimal b) {
        if (a == null) {
            return false;
        }
        if (b == null) {
            return true;
        }
        return a.compareTo(b) == 1;
    }

    /**
     * a >= b
     *
     * @param a
     * @param b
     * @return
     */
    public static boolean greaterEqual(BigDecimal a, BigDecimal b) {
        if (a == null) {
            return false;
        }
        if (b == null) {
            return true;
        }
        return a.compareTo(b) != -1;
    }

    /**
     * 元到分
     *
     * @param dollar
     * @return
     */
    public static long toPenny(BigDecimal dollar) {
        return dollar.multiply(HUNDRED).setScale(KEEP_SCALE, RoundingMode.HALF_EVEN).longValue();
    }

    public static BigDecimal scale(BigDecimal bigDecimal) {
        return bigDecimal == null ? null : bigDecimal.setScale(KEEP_SCALE, RoundingMode.HALF_EVEN);
    }

    /**
     * 显示， 元，只显示2位小数
     *
     * @param amount
     * @return
     */
    public static BigDecimal toShow(BigDecimal amount, int in) {
        return toShow(amount, in == DIRECTION_IN);
    }

    public static BigDecimal toShow(BigDecimal amount) {
        return toShow(amount, IN);
    }

    private static final BigDecimal MIN = new BigDecimal(0.01D).setScale(2, BigDecimal.ROUND_DOWN);

    public static BigDecimal toShow(BigDecimal amount, boolean in) {
        if (amount.compareTo(MIN) == -1
                && amount.compareTo(BigDecimal.ZERO) == 1) {
            return MIN;
        }
        return in ? amount.setScale(2, BigDecimal.ROUND_DOWN) : amount.setScale(2, RoundingMode.HALF_EVEN);
    }

    public static BigDecimal toShowScaleByTwo(BigDecimal amount) {
        if(amount.compareTo(BigDecimal.ZERO) < 0){
            return BigDecimal.ZERO;
        }
        return amount.setScale(2,BigDecimal.ROUND_DOWN);
    }
    /**
     * 显示，分。 2位小数
     *
     * @param penny
     * @return
     */
//    public static BigDecimalTest toDollarShow(long penny) {
//        return new BigDecimalTest(penny / 100D).setScale(2, BigDecimalTest.ROUND_DOWN);
//    }
//
//    public static BigDecimalTest toDollarShow(BigDecimalTest penny) {
//        return penny.divide(HUNDRED, 2, BigDecimalTest.ROUND_DOWN);
//    }
}
