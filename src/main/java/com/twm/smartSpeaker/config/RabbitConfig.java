package com.twm.smartSpeaker.config;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitConfig {

    @Bean
    public Queue createQueue() {
    	
        return new Queue("smartSpeaker");
    }

}