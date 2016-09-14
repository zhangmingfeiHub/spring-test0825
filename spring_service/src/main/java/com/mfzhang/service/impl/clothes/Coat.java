package com.mfzhang.service.impl.clothes;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.mfzhang.api.service.Clothes;

/**
 * 衣服-外套
 *
 * @author mingfei.zhang
 * @date 2016年9月14日-下午7:42:34
 */
public class Coat implements Clothes {

	private static final Logger logger = LoggerFactory.getLogger(Coat.class);
	
	@Override
	public void wear() {
		logger.info("---wear Coat...---");
	}

}
