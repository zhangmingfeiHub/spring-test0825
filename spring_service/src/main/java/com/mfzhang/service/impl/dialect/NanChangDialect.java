package com.mfzhang.service.impl.dialect;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.mfzhang.api.service.Dialect;

/**
 * 方言-南昌方言
 *
 * @author mingfei.zhang
 * @date 2016年9月16日-上午10:10:36
 */
public class NanChangDialect implements Dialect {

	private static final Logger logger = LoggerFactory.getLogger(NanChangDialect.class);
	
	@Override
	public void speak() {
		logger.info("---speak NanChangDialect...---");
	}

}
