package com.xuww.springbootdemo.util.study.ORM;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * @Author: xuww
 * @Description:
 * @Date: Created 17:16 2018/12/29.
 * @Modifide BY
 * @Version: 1.0
 */
public class DBUtil {
    /**
     * 数据库操作工具类
     */
    private static String DRIVER_CLASS="com.mysql.jdbc.Driver";
    private static String URL="jdbc:mysql://localhost:3306/yfbx";
    private static String USER="root";
    private static String PASSWORD="at0594";
    //封装加载驱动
    static {
        try {
            Class.forName(DRIVER_CLASS);
        }catch(ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    //封装连接数据库
    public static Connection getConnection() {
        try {
            return DriverManager.getConnection(URL, USER, PASSWORD);
        }catch(SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
    //定义通用的增删改的方法
    //parameters占位符sql语句对应的值组成的数组
    public static int executeUpdate(String sql,Object...parameters) {
        int row=0;
        Connection conn=getConnection();
        PreparedStatement pst=null;
        try {
            pst=conn.prepareStatement(sql);
            //判断有没有参数需要设置
            if(parameters.length>0) {
                for(int i=0;i<parameters.length;i++) {
                    //参数类型如何判断呢。所有类都是object子类
                    pst.setObject(i+1, parameters[i]);
                }
            }
            //执行sql语句
            row=pst.executeUpdate();
        }catch(Exception e) {
            e.printStackTrace();
        }finally {
            try {
                if(pst!=null) {
                    pst.close();
                }
            }catch(SQLException e) {
                e.printStackTrace();
            }
            try {
                if(conn!=null) {
                    conn.close();
                }
            }catch(SQLException e) {
                e.printStackTrace();
            }
        }
        return row;
    }
}

