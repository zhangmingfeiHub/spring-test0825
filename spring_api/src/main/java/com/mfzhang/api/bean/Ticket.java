package com.mfzhang.api.bean;

import java.io.Serializable;

/**
 * 门票
 *
 * @author mingfei.zhang
 * @date 2016年9月12日-上午9:13:15
 */
public class Ticket implements Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -7365632122847117432L;

	private Integer id; // 门票id
	private String number; // 门票号码
	private String floor; // 楼层
	private String hall; // 大厅

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getFloor() {
		return floor;
	}

	public void setFloor(String floor) {
		this.floor = floor;
	}

	public String getHall() {
		return hall;
	}

	public void setHall(String hall) {
		this.hall = hall;
	}

}
