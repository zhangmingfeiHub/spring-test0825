package com.mfzhang.service.impl.instrument;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.mfzhang.api.service.Instrument;

/**
 * 乐器-吉他
 *
 * @author mingfei.zhang
 * @date 2016年9月12日-下午9:26:52
 */
public class Guitar implements Instrument {

	private static final Logger logger = LoggerFactory.getLogger(Guitar.class);
	
	@Override
	public void play() {
		logger.info("---Guitar.play---");
	}

}
