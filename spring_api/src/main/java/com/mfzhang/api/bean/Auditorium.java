package com.mfzhang.api.bean;

import java.io.Serializable;

/**
 * 表演大厅
 *
 * @author mingfei.zhang
 * @date 2016年9月12日-上午9:52:04
 */
public class Auditorium implements Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -7251539480892490482L;
	
	public void turnOnLights() {
		System.out.println("---turnOnLights---");
	}
	
	public void turnOffLights() {
		System.out.println("---turnOffLights---");
	}

}
