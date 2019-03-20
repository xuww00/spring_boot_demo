package com.xuww.springbootdemo.service.impl;

import com.xuww.springbootdemo.annotation.MongoCache;
import com.xuww.springbootdemo.entity.User;
import com.xuww.springbootdemo.service.UserService;
import org.springframework.stereotype.Service;

/**
 * @Author: xuww
 * @Description:
 * @Date: Created 20:09 2018/11/24.
 * @Modifide BY
 * @Version: 1.0
 */
@Service
public class UserServiceImpl implements UserService {
    @Override
    @MongoCache
    public User get(String id, String name) {
        User user = new User();
        user.setLoginName("123");
        user.setId(1L);
        user.setName("123");
        return user;
    }
}
