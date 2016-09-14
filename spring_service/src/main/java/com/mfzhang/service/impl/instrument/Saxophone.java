package com.mfzhang.service.impl.instrument;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.mfzhang.api.service.Instrument;

/**
 * 乐器-萨克斯
 *
 * @author mingfei.zhang
 * @date 2016年9月12日-下午6:27:15
 */
public class Saxophone implements Instrument {

	private static final Logger logger = LoggerFactory.getLogger(Saxophone.class);
	
	@Override
	public void play() {
		logger.info("---Saxophone.play---");
	}

}
