package com.mfzhang.service.impl.mindreader;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.mfzhang.api.service.MindReader;

/**
 * 读心者-魔术师
 *
 * @author mingfei.zhang
 * @date 2016年9月21日-上午9:36:04
 */
@Aspect
@Component
public class Megician2 implements MindReader {

	private static final Logger logger = LoggerFactory.getLogger(Megician2.class);
	
	private String thoughts;
	
	@Pointcut("execution(* com.mfzhang.api.service.Thinker.thinkOfSomething(..)) && args(thoughts)")
	public void think(String thoughts) { };
	
	@Override
	@Before("think(thoughts)")
	public void interceptThoughts(String thoughts) {
		logger.info("---Megician2 interceptThoughts: " + thoughts + " ...---");
		this.thoughts = thoughts;
	}

	@Override
	public String getThoughts() {
		
		logger.info("---Megician2 getThoughts: " + this.thoughts + "...---");
		
		return this.thoughts;
	}

}
