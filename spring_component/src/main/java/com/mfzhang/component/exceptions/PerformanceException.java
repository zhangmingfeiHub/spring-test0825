package com.mfzhang.component.exceptions;

import java.io.Serializable;

/**
 * 参赛异常
 *
 * @author mingfei.zhang
 * @date 2016年9月5日-上午10:04:09
 */
public class PerformanceException extends RuntimeException implements Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -597547407410575581L;

	public PerformanceException(String message) {
		super(message);
	}

}
