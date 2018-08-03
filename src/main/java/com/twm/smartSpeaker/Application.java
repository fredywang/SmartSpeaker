package com.twm.smartSpeaker;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@Configuration   
@EnableAutoConfiguration
@ComponentScan("com.twm.smartSpeaker")
public class Application {
    private static final Logger logger = LoggerFactory.getLogger(Application.class);

    public static void main(String[] args){
        logger.info("Application Run Start.....");
        SpringApplication app = new SpringApplication(Application.class);
        //ApplicationContext ctx = SpringApplication.run(Application.class, args);
        //app.setEnvironment(new EncryptableEnvironment(new StandardEnvironment()));
        app.run(args);
        //SpringApplication.run(Application.class, args);
        logger.info("Application Run End OK.....spring.profiles.active="+System.getProperty("spring.profiles.active"));
    }
}
