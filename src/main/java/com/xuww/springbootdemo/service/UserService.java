package com.xuww.springbootdemo.service;

import com.xuww.springbootdemo.entity.User;

/**
 * @Author: xuww
 * @Description:
 * @Date: Created 20:09 2018/11/24.
 * @Modifide BY
 * @Version: 1.0
 */
public interface UserService {
    User get(String id, String name);
}
