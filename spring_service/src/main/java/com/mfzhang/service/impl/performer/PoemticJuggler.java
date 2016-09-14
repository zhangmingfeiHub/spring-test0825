package com.mfzhang.service.impl.performer;

import com.mfzhang.api.service.Poemer;
import com.mfzhang.component.exceptions.PerformanceException;

/**
 * 会朗诵诗的杂技师
 *
 * @author mingfei.zhang
 * @date 2016年9月9日-上午9:56:31
 */
public class PoemticJuggler extends Juggler {

	private Poemer poemer;
	
	public PoemticJuggler(int beanBags, Poemer poemer) {
		super(beanBags);
		this.poemer = poemer;
	}
	
	@Override
	public void perform() throws PerformanceException {
		super.perform();
		this.poemer.recite();
	}
	
}
