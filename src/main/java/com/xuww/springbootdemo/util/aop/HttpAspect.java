package com.xuww.springbootdemo.util.aop;

import com.xuww.springbootdemo.util.MongoCacheHelper;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;

/**
 * @Author: xuww
 * @Description:
 * @Date: Created 20:13 2018/11/24.
 * @Modifide BY
 * @Version: 1.0
 */
@Aspect
@Component
public class HttpAspect {
    @Autowired
    private MongoCacheHelper mongoCacheHelper;

    @Pointcut("@annotation(com.xuww.springbootdemo.annotation.MongoCache)")
    public void setJoinPoint(){}


    @Around(value = "setJoinPoint()")
    public Object aroundMethod(ProceedingJoinPoint proceedingJoinPoint)throws Exception{
        Object result = null;
        /**
         * 请求内容打印
         */
        ServletRequestAttributes requestAttributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = requestAttributes.getRequest();
        System.out.println("请求地址：" + request.getRequestURL().toString());
        System.out.println("请求方式：" + request.getMethod());
        System.out.println("请求类方法：" + proceedingJoinPoint.getSignature());
        System.out.println("请求类方法参数：" + Arrays.toString(proceedingJoinPoint.getArgs()));

        Object[] args = proceedingJoinPoint.getArgs();
        String classType = proceedingJoinPoint.getTarget().getClass().getName();
        Class<?> clazz = Class.forName(classType);
        String className = clazz.getName();
        String methodName = proceedingJoinPoint.getSignature().getName();
        /**
         * 获取参数名称和值
         */
        StringBuffer sb = LogAopUtil.getNameAndArgs(this.getClass(), className, methodName, args);
        System.out.println("请求类方法参数名和值：" + sb);
        System.out.println("======================请求内容======================");
        try {
            result = proceedingJoinPoint.proceed();
            mongoCacheHelper.saveCache(result);
        }catch (Throwable e){

        }
        return result;
    }


}
