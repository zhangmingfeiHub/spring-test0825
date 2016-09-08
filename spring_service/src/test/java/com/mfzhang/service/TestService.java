package com.mfzhang.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.testng.annotations.Test;

import com.mfzhang.api.service.Perfomer;

public class TestService {

	private static final Logger logger = LoggerFactory.getLogger(TestService.class);
	
	@Test
	public void testPerfomer() {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-services.xml");
		Perfomer duke = ctx.getBean("duke",Perfomer.class);
		duke.perform();
	}
	
}
