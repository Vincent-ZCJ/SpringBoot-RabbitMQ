package com.zcj977.enginerabbitMQ;

import com.zcj977.enginerabbitMQ.controller.MessageController;
import com.zcj977.enginerabbitMQ.service.MessageSender;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EngineRabbitMqApplicationTests {

	@Autowired
	private MessageSender messageSender;

	@Autowired
	private MessageController messageController;
	@Test
	public void contextLoads() {
	}

	@Test
	public void messageSender(){
		messageController.testDoc("zcj");
//		messageSender.sendMessage();
	}

}
