package com.xuww.springbootdemo.util.study.Annotation;

import java.awt.event.ActionListener;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @Author: xuww
 * @Description:
 * @Date: Created 19:36 2018/11/24.
 * @Modifide BY
 * @Version: 1.0
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface ActionListenerFor {


    Class<? extends ActionListener> listener();
}
