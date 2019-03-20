package com.xuww.springbootdemo.util.study;

import java.math.BigDecimal;

/**
 * @Author: xuww
 * @Description:
 * @Date: Created 13:36 2019/3/16.
 * @Modifide BY
 * @Version: 1.0
 */
public class Test {
    public static void main(String[] args) {
        test(3, 8, new char[]{'h','a','p','p','y'});
    }
    public static BigDecimal test(int month , int day, char[] content){
        char[][] test = new char[3][9];
        char[][] newTest = new char[3][9];
        for (int i = 0; i <= 2; i++){
            for (int j = 0; j <= 8; j++){
                int value = i*9+j+1;
                test[i][j] = (char)(96+value);
            }
        }

        int monthMove = (month - 1)%3;
        int dayMover = (day - 1)%9;
        for (int i = 0; i <= 2; i++){
            for (int j = 0; j <= 8; j++){
                int tempI = i;
                int tempJ = j;
                for (int x = 1; x <= monthMove; x++){
                    tempI = tempI - 1;
                    if (tempI < 0){
                        tempI = 2;
                    }
                }
                for (int x = 1; x <= dayMover; x++){
                    tempJ = tempJ - 1;
                    if (tempJ < 0){
                        tempJ = 8;
                    }
                }
                newTest[tempI][tempJ] = test[i][j];
            }
        }
        for (char c : content){
            for (int i = 0; i <= 2; i++){
                for (int j = 0; j <= 8; j++){
                    if (c == newTest[i][j]){
                        int tempI = i+1;
                        int tempJ = j+1;
                        System.out.println(tempI+""+tempJ+"");
                    }
                }
            }
        }
        return null;
    }
}
