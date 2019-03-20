package com.xuww.springbootdemo.util.study.DataFomartter;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

/**
 * @Author: xuww
 * @Description:
 * @Date: Created 16:59 2018/11/16.
 * @Modifide BY
 * @Version: 1.0
 */
public class DataFormatters {
    public static void main(String[] args) {
        DateTimeFormatter[] formatters = new DateTimeFormatter[]{
                DateTimeFormatter.ISO_LOCAL_DATE,
                DateTimeFormatter.ISO_LOCAL_TIME,
                DateTimeFormatter.ISO_LOCAL_DATE_TIME,
                DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL, FormatStyle.MEDIUM),
                DateTimeFormatter.ofLocalizedTime(FormatStyle.LONG),
                DateTimeFormatter.ofPattern("Gyyyy%%MMM%%dd HH:mm:ss")

        };
        LocalDateTime date = LocalDateTime.now();
        for (int i = 0; i < formatters.length; i++){
            System.out.println(date.format(formatters[i]));
            System.out.println(formatters[i].format(date));
        }
    }
}
