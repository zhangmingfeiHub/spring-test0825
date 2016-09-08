package com.mfzhang.api.service;

import com.mfzhang.component.exceptions.PerformanceException;

/**
 * 参赛者业务接口
 *
 * @author mingfei.zhang
 * @date 2016年9月5日-上午10:02:32
 */
public interface Perfomer {

	/**
	 * 表演
	 * 
	 * @throws PerformanceException
	 * @author mingfei.zhang, 2016年9月5日 上午10:13:41
	 */
	void perform() throws PerformanceException;
	
}
