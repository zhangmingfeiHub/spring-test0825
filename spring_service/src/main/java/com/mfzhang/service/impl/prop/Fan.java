package com.mfzhang.service.impl.prop;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.mfzhang.api.service.Prop;

/**
 * 道具-扇子
 *
 * @author mingfei.zhang
 * @date 2016年9月14日-上午9:53:27
 */
@Component
public class Fan implements Prop {

	private static final Logger logger = LoggerFactory.getLogger(Fan.class);
	
	@Override
	public void doFunction() {
		logger.info("---Fan doFunction...---");
	}

}
