package com.xuww.springbootdemo.util.study.Local;

import java.util.Locale;

/**
 * @Author: xuww
 * @Description:
 * @Date: Created 15:49 2018/11/16.
 * @Modifide BY
 * @Version: 1.0
 */
public class LocalTest {
    public static void main(String[] args) {
        Locale[] locales = Locale.getAvailableLocales();
        for (int i = 0; i < locales.length; i++ ){
            System.out.println(locales[i].getDisplayCountry() + "=" + locales[i].getCountry()+ "" + locales[i].getDisplayLanguage()+"="+locales[i].getLanguage() );
        }
    }
}
