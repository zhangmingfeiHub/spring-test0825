package com.mfzhang.service.impl.instrument;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.mfzhang.api.service.Instrument;

public class Piano implements Instrument {

	private static final Logger logger = LoggerFactory.getLogger(Piano.class);
	
	@Override
	public void play() {
		logger.info("---Piano.play---");
	}

}
