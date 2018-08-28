package com.twm.smartSpeaker.controller;

import java.util.concurrent.CountDownLatch;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.twm.smartSpeaker.rabbitmq.Receiver;
import com.twm.smartSpeaker.rabbitmq.Sender;

@RestController
@EnableAutoConfiguration
@ComponentScan
public class ReceiverController {

	private static final Logger logger = LoggerFactory.getLogger(ReceiverController.class);

	private CountDownLatch latch = new CountDownLatch(1);

	@Autowired
	private Sender senderService;
	
//	@Autowired
//	private Receiver receiverService;
	
	/*
	 * public void receiveMessage(String message) { System.out.println("Received <"
	 * + message + ">"); latch.countDown(); }
	 * 
	 * public CountDownLatch getLatch() { return latch; }
	 */

	@RequestMapping(value = "sendMsg", method = RequestMethod.GET)
	public String sendMsg(HttpServletRequest request, @RequestParam(value = "id") String id) {
		logger.info("id = "+id);
		senderService.send(id);
		return id;
	}
/*
	@RequestMapping(value = "receiveMsg", method = RequestMethod.GET)
	public void receiveMsg() {
		receiverService.getClass();
	} */
	
}
