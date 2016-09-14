package com.mfzhang.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.mfzhang.api.bean.Auditorium;
import com.mfzhang.api.bean.Stage;
import com.mfzhang.api.bean.TestInitAndDestoryBean;
import com.mfzhang.api.bean.Ticket;
import com.mfzhang.api.service.Perfomer;
import com.mfzhang.service.impl.performer.Instrumentalist;

public class TestService {

	private static final Logger logger = LoggerFactory.getLogger(TestService.class);
	
	private ApplicationContext ctx = null;
	
	@BeforeMethod
	public void before() {
		ctx = new ClassPathXmlApplicationContext("spring-services.xml");
	}
	
	@Test
	public void testPerfomer() {
		
//		Perfomer duke = ctx.getBean("duke",Perfomer.class);
//		duke.perform();
//		
//		Perfomer poemticJuggler1 = ctx.getBean("poemticJuggler",Perfomer.class);
//		poemticJuggler1.perform();
//		
//		Perfomer poemticJuggler2 = ctx.getBean("poemticJuggler",Perfomer.class);
//		poemticJuggler2.perform();
//		logger.info("--poemticJuggler1: " + poemticJuggler1 + ", poemticJuggler2: " + poemticJuggler2 + "---------------------------");
		
//		Perfomer kenny = ctx.getBean("kenny", Perfomer.class);
//		kenny.perform();
//		
//		Perfomer kenny2 = ctx.getBean("kenny2", Perfomer.class);
//		kenny2.perform();
		
//		Perfomer hank = ctx.getBean("hank", Perfomer.class);
//		hank.perform();
		
//		Perfomer car1 = ctx.getBean("carl", Perfomer.class);
//		car1.perform();
		
//		Perfomer kenny3 = ctx.getBean("kenny3", Perfomer.class);
//		kenny3.perform();
		
//		Perfomer kenny4 = ctx.getBean("kenny4", Perfomer.class);
//		kenny4.perform();
		
		Perfomer opusculum = ctx.getBean("opusculum", Perfomer.class);
		opusculum.perform();
	}
	
	@Test
	public void TestStage() {
		Stage stage1 = ctx.getBean("stage",Stage.class);
		Stage stage2 = ctx.getBean("stage",Stage.class);
		logger.info("--stage1: " + stage1 + ", stage2: " + stage2 + "---------------------------");
		
		Stage stageScope1 = ctx.getBean("stageScope",Stage.class);
		Stage stageScope2 = ctx.getBean("stageScope",Stage.class);
		logger.info("--stageScope1: " + stageScope1 + ", stageScope2: " + stageScope2 + "---------------------------");
	}
	
	@Test
	public void TestTicket() {
		// 测试bean作用域
		Ticket ticket1 = ctx.getBean("ticket", Ticket.class);
		Ticket ticket2 = ctx.getBean("ticket", Ticket.class);
		logger.info("--ticket1: " + ticket1 + ", ticket2: " + ticket2 + "---------------------------");
		
		// 测试相同javaBean的不同bean id实例是否相同
		Ticket ticketScope1 = ctx.getBean("ticketScope", Ticket.class);
		Ticket ticketScope2 = ctx.getBean("ticketScope", Ticket.class);
		logger.info("--ticketScope1: " + ticketScope1 + ", ticketScope2: " + ticketScope2 + "---------------------------");
	}
	
	@Test
	public void testOther() {
		Auditorium auditorium = ctx.getBean("auditorium", Auditorium.class);
		
		TestInitAndDestoryBean testInitAndDestoryBean = ctx.getBean("testInitAndDestoryBean", TestInitAndDestoryBean.class);
	}
	
	
}
