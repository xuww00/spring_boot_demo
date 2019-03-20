package com.xuww.springbootdemo.controller;

import com.alibaba.fastjson.JSONObject;
import com.xuww.springbootdemo.entity.YUser;
import com.xuww.springbootdemo.entity.mapper.YUserMapper;
import org.elasticsearch.action.index.IndexRequest;
import org.elasticsearch.action.index.IndexResponse;
import org.elasticsearch.client.RestHighLevelClient;
import org.elasticsearch.common.xcontent.XContentType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Calendar;
import java.util.List;

/**
 * @Author: xuww
 * @Description:
 * @Date: Created 10:47 2019/1/17.
 * @Modifide BY
 * @Version: 1.0
 */
@Controller
@RequestMapping("/test")
public class TestController {
    private static Logger LOGGER = LoggerFactory.getLogger(TestController.class);
    @Autowired
    private RestHighLevelClient client;
    @Autowired
    private YUserMapper userMapper;
    @RequestMapping("/index")
    @ResponseBody
    public Object index(String type)throws Exception{
        IndexRequest request = new IndexRequest(
                "posts", //index name
                "doc",  // type
                "1");   // doc id
        String jsonString = "{" +
                "\"user\":\"kimchy\"," +
                "\"postDate\":\"2013-01-30\"," +
                "\"message\":\"trying out Elasticsearch\"" +
                "}";
        request.source(jsonString, XContentType.JSON);
        IndexResponse indexResponse = client.index(request);
        return indexResponse;
    }

    @RequestMapping("/save")
    @ResponseBody
    public void save()throws Exception{
        int size = 100;
        for (int i = 0; ; i++){
            List<YUser> list = userMapper.listByPage(size * i , size * (i+1));
            if (list != null && list.size() > 0){
                long begin = Calendar.getInstance().getTimeInMillis();
                LOGGER.info("=================第"+i+"批数据开始=================");
                for (YUser user : list){
                    IndexRequest request = new IndexRequest(
                            "user", //index name
                            "type",  // type
                            user.getId()+"");   // doc id
                    String jsonString = JSONObject.toJSONString(user);
                    request.source(jsonString, XContentType.JSON);
                    IndexResponse indexResponse = client.index(request);
                    LOGGER.info(indexResponse.toString());
                }
                LOGGER.info("=================第"+i+"批数据结束=================耗时:"+(Calendar.getInstance().getTimeInMillis()-begin));
            }
        }
    }

    @RequestMapping("/saveByPram")
    @ResponseBody
    public Object saveByPram(Integer id, String index, String type)throws Exception{
        YUser user = userMapper.selectByPrimaryKey(id);
        IndexRequest request = new IndexRequest(
                index, //index name
                type,  // type
                user.getId()+"");   // doc id
        String jsonString = JSONObject.toJSONString(user);
        request.source(jsonString, XContentType.JSON);
        IndexResponse indexResponse = client.index(request);
        LOGGER.info(indexResponse.toString());
        return "success";
    }
}
