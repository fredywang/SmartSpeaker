package com.twm.smartSpeaker.rabbitmq;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Sender {
	
	private static final Logger logger = LoggerFactory.getLogger(Sender.class);

	@Autowired
	private AmqpTemplate rabbitTemplate;

	public void send(String id) {
		String context = "hello "+ id + " , date = "+ new Date();
		System.out.println("Sender : " + context);
		logger.info("*****************Sender : " + context + "*******************");
		this.rabbitTemplate.convertAndSend("smartSpeaker", context);
	}

}