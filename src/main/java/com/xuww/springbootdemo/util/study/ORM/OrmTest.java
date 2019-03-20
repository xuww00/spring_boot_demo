package com.xuww.springbootdemo.util.study.ORM;

import org.junit.Test;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @Author: xuww
 * @Description:
 * @Date: Created 17:18 2018/12/29.
 * @Modifide BY
 * @Version: 1.0
 */
public class OrmTest {
    @Test
    public void testInsert() {
        String insertSQL="insert into book(bookAuthor,bookName,bookPrice,bookDate)values(?,?,?,?)";
        Object[] parameters= {
                "小李",
                "新的图书",
                new BigDecimal(45.6),
                new Date()
        };
        int row=DBUtil.executeUpdate(insertSQL, parameters);
        System.out.println(row>0?"成功":"失败");
    }




}
