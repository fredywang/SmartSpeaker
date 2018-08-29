package com.twm.smartSpeaker.rabbitmq;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
//@RabbitListener(queues = "smartSpeaker")
public class Receiver {

	private static final Logger logger = LoggerFactory.getLogger(Receiver.class);
	
    //@RabbitHandler
	@RabbitListener(queues = "smartSpeaker")
    public void process(String smartSpeaker) {
    	//logger.info("Receiver : " + smartSpeaker);
    	logger.info("************************ print = " + smartSpeaker + "************************");
        //System.out.println("Receiver : " + smartSpeaker);
        //System.out.println("************************ print = " + smartSpeaker + "************************");
    }

}
