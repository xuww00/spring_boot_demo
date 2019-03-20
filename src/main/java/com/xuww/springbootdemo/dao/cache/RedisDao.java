package com.xuww.springbootdemo.dao.cache;

import redis.clients.jedis.JedisPool;

/**
 * @Author: xuww
 * @Description:
 * @Date: Created 16:26 2018/12/2.
 * @Modifide BY
 * @Version: 1.0
 */
public class RedisDao {
    private final JedisPool jedisPool;

    public RedisDao(String ip, int port){
        jedisPool = new JedisPool(ip, port);
    }

}
