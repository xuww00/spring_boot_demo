package com.xuww.springbootdemo.util;

import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Component;

/**
 * @Author: xuww
 * @Description:
 * @Date: Created 20:15 2018/11/24.
 * @Modifide BY
 * @Version: 1.0
 */
@Component
public class MongoCacheHelper {
    @Autowired
    private MongoTemplate mongoTemplate;

    public <T> void saveCache(T t){
        mongoTemplate.save(t);
    }
}
