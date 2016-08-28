package com.mfzhang.component.domain;

import java.io.Serializable;

/**
 * restful接口返回数据包装类
 *
 * @author mingfei.zhang
 * @date 2016年8月28日-下午8:11:39
 */
public class Result<T> implements Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -4570085063898186722L;

	private boolean isOk;
	private String msgCode;
	private T data;
	private String message;

	public boolean isOk() {
		return isOk;
	}

	public void setOk(boolean isOk) {
		this.isOk = isOk;
	}

	public String getMsgCode() {
		return msgCode;
	}

	public void setMsgCode(String msgCode) {
		this.msgCode = msgCode;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
