package com.mfzhang.service.impl.instrument;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.mfzhang.api.service.Instrument;

/**
 * 乐器-口琴
 *
 * @author mingfei.zhang
 * @date 2016年9月12日-下午9:36:59
 */
public class Harmonica implements Instrument {

	private static final Logger logger = LoggerFactory.getLogger(Harmonica.class);
	
	@Override
	public void play() {
		logger.info("---Harmonica.play---");
	}

}
