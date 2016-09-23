package com.mfzhang.service.impl;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;
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
@Aspect
@Component
public class SpeakerVolunteer2 implements Speaker {

	private static final Logger logger = LoggerFactory.getLogger(SpeakerVolunteer2.class);
	
	// 注解切面引入新功能
	@DeclareParents(value = "com.mfzhang.api.service.Thinker+", defaultImpl=SpeakerVolunteer2.class)
	public static Speaker speaker;
	
	@Override
	public void speak(String thoughts) {
		logger.info("---SpeakerVolunteer2 speak thoughts: " + thoughts + "---");
	}

}
