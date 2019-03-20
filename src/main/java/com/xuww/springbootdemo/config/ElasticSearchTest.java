package com.xuww.springbootdemo.config;

import org.apache.http.HttpHost;
import org.elasticsearch.client.RestClient;
import org.elasticsearch.client.RestHighLevelClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.net.UnknownHostException;
import java.util.concurrent.ExecutionException;

@Configuration
public class ElasticSearchTest {
    @Bean
    public RestHighLevelClient before() throws UnknownHostException, InterruptedException, ExecutionException {
        RestClient lowLevelRestClient = RestClient.builder(
                new HttpHost("192.168.1.201", 9200, "http")).build();
        //High Level Client init
        RestHighLevelClient client =
                new RestHighLevelClient(lowLevelRestClient);
        return  client;
    }
}