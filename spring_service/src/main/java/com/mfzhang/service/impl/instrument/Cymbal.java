package com.mfzhang.service.impl.instrument;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.mfzhang.api.service.Instrument;

/**
 * 乐器-铙钹（náo bó）
 *
 * @author mingfei.zhang
 * @date 2016年9月12日-下午9:35:26
 */
public class Cymbal implements Instrument {

	private static final Logger logger = LoggerFactory.getLogger(Cymbal.class);
	
	@Override
	public void play() {
		logger.info("---Cymbal.play---");
	}

}
