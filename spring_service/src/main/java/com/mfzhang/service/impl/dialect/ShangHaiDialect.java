package com.mfzhang.service.impl.dialect;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.mfzhang.api.service.Dialect;

/**
 * 方言-上海方言
 *
 * @author mingfei.zhang
 * @date 2016年9月16日-上午11:19:52
 */
public class ShangHaiDialect implements Dialect {

	private static final Logger logger = LoggerFactory.getLogger(ShangHaiDialect.class);
	
	@Override
	public void speak() {
		logger.info("---speak ShangHaiDialect...---");
	}

}
