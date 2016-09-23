package com.mfzhang.service.impl.thinker;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.mfzhang.api.service.Thinker;

/**
 * 思考者-志愿者
 *
 * @author mingfei.zhang
 * @date 2016年9月21日-上午9:42:02
 */
@Component
public class Volunteer implements Thinker {

	private static final Logger logger = LoggerFactory.getLogger(Volunteer.class);
	
	private String thoughts;
	
	@Override
	public void thinkOfSomething(String thoughts) {
		this.thoughts = thoughts;
		
		logger.info("---Volunteer thinkOfSomething: " + thoughts + "...---");
	}

	public String getThoughts() {
		logger.info("---Volunteer getThoughts: " + thoughts + "...---");
		
		return thoughts;
	}
	

}
