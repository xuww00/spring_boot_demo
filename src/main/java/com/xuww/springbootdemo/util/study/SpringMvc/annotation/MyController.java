package com.xuww.springbootdemo.util.study.SpringMvc.annotation;

import org.springframework.data.mongodb.core.mapping.Document;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @Author: xuww
 * @Description:
 * @Date: Created 15:59 2019/2/12.
 * @Modifide BY
 * @Version: 1.0
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Document
public @interface MyController {
    /**
     * 表示给controller注册别名
     * @return
     */
    String value() default "";
}
