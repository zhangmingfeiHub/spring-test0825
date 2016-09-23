package com.mfzhang.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.mfzhang.api.service.Speaker;

/**
 * 演说-志愿者
 *
 * @author mingfei.zhang
 * @date 2016年9月22日-下午5:27:44
 */
@Component
public class SpeakerVolunteer implements Speaker {

	private static final Logger logger = LoggerFactory.getLogger(SpeakerVolunteer.class);
	
	@Override
	public void speak(String thoughts) {
		logger.info("---SpeakerVolunteer speak thoughts: " + thoughts + "---");
	}

}
