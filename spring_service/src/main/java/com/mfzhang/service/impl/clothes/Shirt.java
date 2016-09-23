package com.mfzhang.service.impl.clothes;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.mfzhang.api.service.Clothes;
import com.mfzhang.component.annotation.AbcClothesQualifier;

/**
 * 衣服-衬衫
 *
 * @author mingfei.zhang
 * @date 2016年9月16日-上午9:52:02
 */
@AbcClothesQualifier
public class Shirt implements Clothes {

	private static final Logger logger = LoggerFactory.getLogger(Shirt.class);
	
	@Override
	public void wear() {
		logger.info("---wear Shirt...---");
	}

}
