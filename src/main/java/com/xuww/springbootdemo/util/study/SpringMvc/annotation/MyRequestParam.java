package com.xuww.springbootdemo.util.study.SpringMvc.annotation;

import org.springframework.data.mongodb.core.mapping.Document;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @Author: xuww
 * @Description:
 * @Date: Created 16:02 2019/2/12.
 * @Modifide BY
 * @Version: 1.0
 */
@Target(ElementType.PARAMETER)
@Retention(RetentionPolicy.RUNTIME)
@Document
public @interface MyRequestParam {
    /**
     * 表示参数的别名，必填
     * @return
     */
    String value();
}
