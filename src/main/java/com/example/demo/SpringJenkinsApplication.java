package com.example.demo;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringJenkinsApplication {

	public static Logger logger = LoggerFactory.getLogger(SpringJenkinsApplication.class);

	@PostConstruct
	public void init() {
		logger.info("-------Application has started-----------");
	}

	public static void main(String[] args) {
		logger.info("-------Application entered main method-----------");
		SpringApplication.run(SpringJenkinsApplication.class, args);
	}

}
