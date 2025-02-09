package com.xuww.springbootdemo.util.study.Kafka;

/**
 * @Author: xuww
 * @Description:
 * @Date: Created 15:13 2018/11/19.
 * @Modifide BY
 * @Version: 1.0
 */
import kafka.consumer.Consumer;
import kafka.consumer.ConsumerConfig;
import kafka.consumer.ConsumerIterator;
import kafka.consumer.KafkaStream;
import kafka.javaapi.consumer.ConsumerConnector;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

/**
 * 接收数据
 接收到: message: 10
 接收到: message: 11
 接收到: message: 12
 接收到: message: 13
 接收到: message: 14
 */
public class KafkaConsumer extends Thread{

    private String topic;

    public KafkaConsumer(String topic){
        super();
        this.topic = topic;
    }

    @Override
    public void run() {
        ConsumerConnector consumer = createConsumer();
        Map<String, Integer> topicCountMap = new HashMap<String, Integer>();
        topicCountMap.put(topic, 1); // 1表示consumer thread线程数量
        Map<String, List<KafkaStream<byte[], byte[]>>>  messageStreams = consumer.createMessageStreams(topicCountMap);
        KafkaStream<byte[], byte[]> stream = messageStreams.get(topic).get(0);// 获取每次接收到的这个数据
        ConsumerIterator<byte[], byte[]> iterator =  stream.iterator();
        while(iterator.hasNext()){
            String message = new String(iterator.next().message());
            System.out.println("接收到: " + message);
        }
    }
    

    private ConsumerConnector createConsumer() {
        Properties properties = new Properties();
        properties.put("zookeeper.session.timeout.ms", "36000");
        properties.put("zookeeper.connect", "192.168.1.201:2181");//声明zk
        properties.put("group.id", "group1");// 必须要使用别的组名称， 如果生产者和消费者都在同一组，则不能访问同一组内的topic数据
        return Consumer.createJavaConsumerConnector(new ConsumerConfig(properties));
    }

    public static void main(String[] args) {
        new KafkaConsumer("photo").start();// 使用kafka集群中创建好的主题 test
    }

}
