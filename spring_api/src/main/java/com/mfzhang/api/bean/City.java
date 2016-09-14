package com.mfzhang.api.bean;

import java.io.Serializable;

/**
 * 城市
 *
 * @author mingfei.zhang
 * @date 2016年9月13日-下午5:23:11
 */
public class City implements Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -4052780954291028479L;

	private String name;
	private String code; // 城市编号
	private int population; // 人口

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public int getPopulation() {
		return population;
	}

	public void setPopulation(int population) {
		this.population = population;
	}

}
