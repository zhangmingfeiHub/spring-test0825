package com.mfzhang.service.impl.performer;

import javax.inject.Inject;
import javax.inject.Named;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.mfzhang.api.service.Clothes;
import com.mfzhang.api.service.Dialect;
import com.mfzhang.api.service.Perfomer;
import com.mfzhang.api.service.Prop;
import com.mfzhang.component.annotation.AbcClothesQualifier;
import com.mfzhang.component.exceptions.PerformanceException;

/**
 * 参赛者-小品演员
 *
 * @author mingfei.zhang
 * @date 2016年9月14日-上午9:43:06
 */
@Component
public class Opusculum implements Perfomer {

	private final static Logger logger = LoggerFactory.getLogger(Opusculum.class);
	
	@Autowired(required=false)
	// @Qualifier(value="stringed")
	@Qualifier(value="fan")
	private Prop prop;
	
	@Autowired
	// @Qualifier(value="abc")
	@AbcClothesQualifier
	private Clothes clothes;
	
	@Inject
	@Named("shangHaiDialect")
	// @DialectQualifier
	private Dialect dialect;
	
	@Value("2")
	private Integer person;
	
	@Override
	public void perform() throws PerformanceException {
		logger.info("---Opusculum perform... person: " + person + "---");
		prop.doFunction();
		clothes.wear();
		dialect.speak();
	}

}
