package com.mfzhang.service.impl.performer;

import java.util.Enumeration;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.mfzhang.api.service.Instrument;
import com.mfzhang.api.service.Perfomer;
import com.mfzhang.component.exceptions.PerformanceException;

/**
 * 参赛者--一人乐队
 *
 * @author mingfei.zhang
 * @date 2016年9月12日-下午9:15:46
 */
public class OneManBand implements Perfomer {

	private static final Logger logger = LoggerFactory.getLogger(OneManBand.class);
	
	private List<Instrument> instrumentList;
	private Map<String, Instrument> instrumentForMap; // Map类型
	private Properties instrumentForProperties; // Properties类型
	
	@Override
	public void perform() throws PerformanceException {
		if (instrumentList != null) {
			for (int i=0; i<instrumentList.size(); i++) {
				instrumentList.get(i).play();
				logger.info("---instrumentList index " + i + "---");
			}
		}
		
		if (instrumentForMap != null) {
			for (String key : instrumentForMap.keySet()) {
				logger.info("---" + key + " : ---");
				instrumentForMap.get(key).play();
			}
		}
		
		if (instrumentForProperties != null) {
			Enumeration<?> enumeration = instrumentForProperties.propertyNames();
			while (enumeration.hasMoreElements()) {
				String key = (String) enumeration.nextElement();
				String value = instrumentForProperties.getProperty(key);
				logger.info("--- key : " + key + ", value : " + value + " ---");
			}
		}
	}

	public List<Instrument> getInstrumentList() {
		return instrumentList;
	}

	public void setInstrumentList(List<Instrument> instrumentList) {
		this.instrumentList = instrumentList;
	}

	public Map<String, Instrument> getInstrumentForMap() {
		return instrumentForMap;
	}

	public void setInstrumentForMap(Map<String, Instrument> instrumentForMap) {
		this.instrumentForMap = instrumentForMap;
	}

	public Properties getInstrumentForProperties() {
		return instrumentForProperties;
	}

	public void setInstrumentForProperties(Properties instrumentForProperties) {
		this.instrumentForProperties = instrumentForProperties;
	}
	
}
