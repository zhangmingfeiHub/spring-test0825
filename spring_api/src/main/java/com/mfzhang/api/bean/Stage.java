package com.mfzhang.api.bean;

import java.io.Serializable;

/**
 * 表演舞台(单例)
 *
 * @author mingfei.zhang
 * @date 2016年9月9日-上午10:58:47
 */
public class Stage implements Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 3304120951634490801L;

	private Stage() {}
	
	private static class StageSingletonHolder {
		private static final Stage INSTANCE = new Stage();
	}
	
	public static Stage getInstance() {
		return StageSingletonHolder.INSTANCE;
	}
	
}
