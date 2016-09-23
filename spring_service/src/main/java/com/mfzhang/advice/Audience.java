package com.mfzhang.advice;

import org.aspectj.lang.ProceedingJoinPoint;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 观众-aop 通知
 *
 * @author mingfei.zhang
 * @date 2016年9月20日-上午10:23:52
 */
public class Audience {

	private static final Logger logger = LoggerFactory.getLogger(Audience.class);
	
	/**
	 * 找座位
	 * 
	 * @author mingfei.zhang, 2016年9月20日 上午10:29:25
	 */
	public void takeSeats() {
		logger.info("---Audience take seats...---");
	}
	
	/**
	 * 关闭手机
	 * 
	 * @author mingfei.zhang, 2016年9月20日 上午10:29:34
	 */
	public void turnOffMobile() {
		logger.info("---Audience turn off mobile...---");
	}
	
	/**
	 * 鼓掌
	 * 
	 * @author mingfei.zhang, 2016年9月20日 上午10:29:41
	 */
	public void applaud() {
		logger.info("---Audience applaud...---");
	}
	
	/**
	 * 要求退票
	 * 
	 * @author mingfei.zhang, 2016年9月20日 上午10:30:28
	 */
	public void demandRefund() {
		logger.info("---Audience demand refund...---");
	}
	
	/**
	 * 看表演
	 * 
	 * @param joinPoint
	 * @author mingfei.zhang, 2016年9月20日 下午3:24:10
	 */
	public void watchPerformance(ProceedingJoinPoint joinPoint) {
		try {
			logger.info("---Audience take seats...---");
			logger.info("---Audience turn off mobile...---");
			
			long start = System.currentTimeMillis();
			
			joinPoint.proceed();
			
			long end = System.currentTimeMillis();
			logger.info("---end - start: " + (end-start) + "---"); 
			
			logger.info("---Audience applaud...---");
		} catch (Throwable e) {
			logger.info("---Audience demand refund...---");
		}
	}
	
}
