package com.xuww.springbootdemo.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @Author: xuww
 * @Description:
 * @Date: Created 20:08 2018/11/24.
 * @Modifide BY
 * @Version: 1.0
 */
@Document(collection = "testUser")
public class User {
    @Id
    private Long id;
    private String name;
    private String loginName;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }
}
