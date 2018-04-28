package com.zcj977.enginerabbitMQ.service;

import com.zcj977.enginerabbitMQ.common.QueneConfig;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MessageSender {

    @Autowired
    private AmqpTemplate amqpTemplate;

    public void sendMessage(){
        System.out.println("开始发送消息啦...");
        amqpTemplate.convertAndSend(QueneConfig.testQueueName,"你好啊！977~");
    }

    public void sendMessage1(String msg){
        System.out.println("开始发送消息啦...");
        amqpTemplate.convertAndSend(QueneConfig.testQueueName,msg);
    }
}
