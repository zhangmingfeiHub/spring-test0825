package com.mfzhang.service.impl.dialect;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.mfzhang.api.service.Dialect;
import com.mfzhang.component.annotation.DialectQualifier;

/**
 * 方言-南京方言
 *
 * @author mingfei.zhang
 * @date 2016年9月16日-上午11:34:41
 */
@DialectQualifier
public class NanJingDialect implements Dialect {

	private static final Logger logger = LoggerFactory.getLogger(NanJingDialect.class);
	
	@Override
	public void speak() {
		logger.info("---speak NanJingDialect...---");
	}

}
