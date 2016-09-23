package com.mfzhang.advice;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 观众2-aop 通知
 *
 * @author mingfei.zhang
 * @date 2016年9月22日-下午6:58:40
 */
@Aspect
public class Audience2 {

	private static final Logger logger = LoggerFactory.getLogger(Audience2.class);
	
	/**
	 * 切点
	 * 
	 * @author mingfei.zhang, 2016年9月22日 下午7:12:18
	 */
	@Pointcut("execution(* com.mfzhang.api.service.Perfomer.perform(..))")
	public void performance() {}
	
	/**
	 * 找座位-前置通知
	 * 
	 * @author mingfei.zhang, 2016年9月20日 上午10:29:25
	 */
	@Before("performance()")
	public void takeSeats() {
		logger.info("---Audience2 take seats...---");
	}
	
	/**
	 * 关闭手机-前置通知
	 * 
	 * @author mingfei.zhang, 2016年9月20日 上午10:29:34
	 */
	@Before(value="performance()")
	public void turnOffMobile() {
		logger.info("---Audience2 turn off mobile...---");
	}
	
	/**
	 * 鼓掌-后置通知
	 * 
	 * @author mingfei.zhang, 2016年9月20日 上午10:29:41
	 */
	@AfterReturning(pointcut="performance()")
	public void applaud() {
		logger.info("---Audience2 applaud...---");
	}
	
	/**
	 * 要求退票 -后置通知
	 * 
	 * @author mingfei.zhang, 2016年9月20日 上午10:30:28
	 */
	@AfterThrowing(value="performance()")
	public void demandRefund() {
		logger.info("---Audience demand2 refund...---");
	}
	
	/**
	 * 看表演
	 * 
	 * @param joinPoint
	 * @author mingfei.zhang, 2016年9月20日 下午3:24:10
	 */
	@Around("performance()")
	public void watchPerformance(ProceedingJoinPoint joinPoint) {
		try {
			logger.info("---Audience2 take seats Around...---");
			logger.info("---Audience2 turn off mobile Around...---");
			
			long start = System.currentTimeMillis();
			
			joinPoint.proceed();
			
			long end = System.currentTimeMillis();
			logger.info("---end - start: " + (end-start) + " Around---"); 
			
			logger.info("---Audience2 applaud Around...---");
		} catch (Throwable e) {
			logger.info("---Audience2 demand refund Around...---");
		}
	}
	
}
