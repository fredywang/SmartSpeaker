package com.twm.smartSpeaker.controller;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
@ComponentScan
public class SmartSpeakerController {

	private static final Logger logger = LoggerFactory.getLogger(SmartSpeakerController.class);
	
	@RequestMapping(value="getOAuth")
	public String getOAuth(HttpServletRequest request,@RequestParam(value="id", required = false) String id) {
		String r = "id="+id+",連線成功";
		logger.info(r);
		return r;
	}
	
}
