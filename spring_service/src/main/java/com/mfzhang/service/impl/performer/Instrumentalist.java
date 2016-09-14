package com.mfzhang.service.impl.performer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.mfzhang.api.service.Instrument;
import com.mfzhang.api.service.Perfomer;
import com.mfzhang.component.exceptions.PerformanceException;

/**
 * 音乐演奏家
 *
 * @author mingfei.zhang
 * @date 2016年9月12日-下午5:54:26
 */
public class Instrumentalist implements Perfomer {

	private static final Logger logger = LoggerFactory.getLogger(Instrumentalist.class);

	private String song; // 歌曲
	private Instrument instrument; // 乐器
	private Integer age; // 年龄

	public Instrumentalist() {
	}

	@Override
	public void perform() throws PerformanceException {

		logger.info("---Instrumentalist.song: " + song + ", age: " + age + "---");
		instrument.play();
	}

	public String getSong() {
		return song;
	}

	public void setSong(String song) {
		this.song = song;
	}

	public Instrument getInstrument() {
		return instrument;
	}

	public void setInstrument(Instrument instrument) {
		this.instrument = instrument;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

}
