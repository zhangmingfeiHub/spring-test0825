package com.mfzhang.service.impl.performer;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import javax.inject.Inject;
import javax.inject.Provider;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.mfzhang.api.bean.Knife;
import com.mfzhang.component.exceptions.PerformanceException;

/**
 * 杂技师-耍小刀
 *
 * @author mingfei.zhang
 * @date 2016年9月16日-上午10:41:36
 */
@Component
public class KnifeJuggler extends Juggler {

	private static final Logger logger = LoggerFactory.getLogger(Juggler.class);
	private Set<Knife> knives;
	
	/**
	 * Provider可延迟注入
	 * 
	 * @param knifeProvider
	 */
	@Inject
	public KnifeJuggler(Provider<Knife> knifeProvider) {
		knives = new HashSet<Knife>();
		
		for (int i=0; i<5; i++) {
			knives.add(knifeProvider.get());
		}
	}
	
	@Override
	public void perform() throws PerformanceException {
		super.perform();
		
		Iterator<Knife> it = knives.iterator();
		while (it.hasNext()) {
			Knife knife = it.next();
			logger.info("---KnifeJuggler knife... " + knife + "---");
		}
		
	}
	
}
