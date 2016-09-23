package com.mfzhang.service.impl.mindreader;

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
@Component
public class Megician implements MindReader {

	private static final Logger logger = LoggerFactory.getLogger(Megician.class);
	
	private String thoughts;
	
	@Override
	public void interceptThoughts(String thoughts) {
		logger.info("---Megician interceptThoughts: " + thoughts + " ...---");
		this.thoughts = thoughts;
	}

	@Override
	public String getThoughts() {
		
		logger.info("---Megician getThoughts: " + this.thoughts + "...---");
		
		return this.thoughts;
	}

}
