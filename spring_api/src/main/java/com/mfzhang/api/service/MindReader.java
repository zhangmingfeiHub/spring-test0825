package com.mfzhang.api.service;

/**
 * 读心者
 *
 * @author mingfei.zhang
 * @date 2016年9月21日-上午9:32:24
 */
public interface MindReader {

	/**
	 * 拦截思想
	 * 
	 * @param thoughts
	 * @author mingfei.zhang, 2016年9月21日 上午9:33:37
	 */
	void interceptThoughts(String thoughts);
	
	/**
	 * 获取思想
	 * 
	 * @return
	 * @author mingfei.zhang, 2016年9月21日 上午9:33:53
	 */
	String getThoughts();
	
}
