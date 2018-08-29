package com.twm.smartSpeaker.controller;

import java.util.concurrent.CountDownLatch;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.twm.smartSpeaker.rabbitmq.Sender;

@RestController
public class SenderController {

	private static final Logger logger = LoggerFactory.getLogger(SenderController.class);

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

	@RequestMapping(value = "sendMsg")
	public String sendMsg(HttpServletRequest request, @RequestParam(value = "id") String id) {
		logger.info("id = "+id);
		senderService.send(id);
		return "OK";
	}
/*
	@RequestMapping(value = "receiveMsg", method = RequestMethod.GET)
	public void receiveMsg() {
		receiverService.getClass();
	} */
	
}
