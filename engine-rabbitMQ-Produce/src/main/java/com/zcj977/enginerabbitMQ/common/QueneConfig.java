package com.zcj977.enginerabbitMQ.common;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class QueneConfig {
    public static final String testQueueName="zcj-quene";


    @Bean
    public Queue queueA(){
        return new Queue(testQueueName);
    }
}
