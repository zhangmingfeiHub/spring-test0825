package com.mfzhang.service.impl.prop;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.mfzhang.api.service.Prop;

/**
 * 道具-尺子
 *
 * @author mingfei.zhang
 * @date 2016年9月14日-下午7:22:57
 */
public class Ruler implements Prop {

	private static final Logger logger = LoggerFactory.getLogger(Ruler.class);
	
	@Override
	public void doFunction() {
		logger.info("---Ruler doFunction...---");
	}

}
