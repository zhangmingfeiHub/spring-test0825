package com.mfzhang.service.impl.performer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.mfzhang.api.service.Perfomer;
import com.mfzhang.component.exceptions.PerformanceException;

/**
 * 参赛者-杂技师
 *
 * @author mingfei.zhang
 * @date 2016年9月5日-上午10:32:35
 */
public class Juggler implements Perfomer {

	private static final Logger logger = LoggerFactory.getLogger(Juggler.class);

	private int beanBags = 3; // 默认3个beanBag

	public Juggler() {
	}

	public Juggler(int beanBags) {
		this.beanBags = beanBags;
	}

	@Override
	public void perform() throws PerformanceException {

		logger.info("JUGGLING " + this.beanBags + " BEANBAGS.");
	}

	public int getBeanBags() {
		return beanBags;
	}

	public void setBeanBags(int beanBags) {
		this.beanBags = beanBags;
	}

}
