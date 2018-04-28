package com.zcj977.enginerabbitMQ.controller;

import com.zcj977.enginerabbitMQ.service.MessageSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Optional;
import java.util.stream.Stream;

@Controller
public class MessageController {


    @Autowired
    private MessageSender messageSender;


    /**
     * 批量发送消息至队列
     * @throws InterruptedException
     */
    @GetMapping(value = "/send")
    @ResponseBody
    public void MessageTestSend() throws InterruptedException {
        for(int i=0;i<1000;i++){
            messageSender.sendMessage1("消息发送内容"+i);
            System.out.println("[Send--:"+ LocalDateTime.now()+"---"+i+"]");
        }
    }

    /**
     * 单条发送消息
     * @param name
     * @return
     */
    @GetMapping("/hello")
    @ResponseBody
    public String testDoc(String name){
        messageSender.sendMessage1("消息发送内容"+name);
        return name+" "+"hello word!";
    }

    @GetMapping(value = "/testStream")
    @ResponseBody
    public void TestStream(){
        int[] ids=new int[]{1,2,3,4};
       Arrays.stream(ids).forEach(System.out::println);
        System.out.println("aa");
        Stream.of(1,2,3,4,5)
                .filter(item->item>=3)
                .forEach(System.out::println);

        Optional<Integer> optional=Stream.of(1).findFirst();
    }
}
