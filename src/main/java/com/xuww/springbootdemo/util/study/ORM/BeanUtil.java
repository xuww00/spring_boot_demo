package com.xuww.springbootdemo.util.study.ORM;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author: xuww
 * @Description:
 * @Date: Created 17:33 2018/12/29.
 * @Modifide BY
 * @Version: 1.0
 */
public class BeanUtil {
    //通用持久化对象的方法实现
    public<T> int persist(T entity) throws MyORMException{
        StringBuilder sqlBuilder=new StringBuilder("INSERT INTO ");
        //存储参数的集合列表
        List<Object> parameters=new ArrayList<Object>();
        //获取当前操作类的名称
        Class<?> cl=entity.getClass();
        String name=cl.getSimpleName();
        sqlBuilder.append(name).append("(");
        //获取当前操作类中定义的属性
        Field[] fields=cl.getDeclaredFields();
        if(fields!=null&&fields.length>0) {
            for(int i=0;i<fields.length;i++) {
                Field field=fields[i];
                //获取字段对应值
                field.setAccessible(true);
                Object value = null;
                try {
                    value = field.get(entity);
                } catch (Exception e) {
                    throw new MyORMException("获取"+field.getName()+"字段值的时候出现异常"+e.getMessage());

                }
                //判断值是否为空
                if(value!=null) {
                    sqlBuilder.append(field.getName()).append(",");
                    parameters.add(value);
                }
            }
            //删除最后一个逗号
            sqlBuilder.deleteCharAt(sqlBuilder.length()-1);
        }
        sqlBuilder.append(")").append("values (");
        //组装参数列表
        for(int i=0;i<parameters.size();i++) {
            sqlBuilder.append("?,");
        }
        //删除最后一个逗号
        sqlBuilder.deleteCharAt(sqlBuilder.length()-1).append(")");
        System.out.println(sqlBuilder);
        return DBUtil.executeUpdate(sqlBuilder.toString(), parameters.toArray(new Object[parameters.size()]));
    }

}
