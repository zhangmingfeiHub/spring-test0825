package com.mfzhang.service.impl.clothes;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;

import com.mfzhang.api.service.Clothes;

/**
 * 衣服-夹克衫
 *
 * @author mingfei.zhang
 * @date 2016年9月14日-下午7:44:17
 */
@Qualifier("abc")
public class Jacket implements Clothes {

	private static final Logger logger = LoggerFactory.getLogger(Jacket.class);
	
	@Override
	public void wear() {
		logger.info("---wear Jacket...---");
	}

}
