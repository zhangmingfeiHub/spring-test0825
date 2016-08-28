package com.mfzhang.component.domain;

import java.io.Serializable;
import java.util.Map;

/**
 * service返回值包装对象
 *
 * @author mingfei.zhang
 * @date 2016年8月28日-下午3:53:35
 */
public class ServiceResult<T> implements Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 8006512010820612098L;

	private boolean isOk = false; // 操作是否成功
	private int msgType = 0; // msg 状态0表示异常、1表示正确
	private String comment; // 备注
	private String msgCode; // 消息码
	private Object[] msgParams; // 消息参数
	private T data; // 数据
	private Map<String, Object> dataMap; // map型数据

	public boolean isOk() {
		return isOk;
	}

	public void setOk(boolean isOk) {
		this.isOk = isOk;
	}

	public int getMsgType() {
		return msgType;
	}

	public void setMsgType(int msgType) {
		this.msgType = msgType;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public String getMsgCode() {
		return msgCode;
	}

	public void setMsgCode(String msgCode) {
		this.msgCode = msgCode;
	}

	public Object[] getMsgParams() {
		return msgParams;
	}

	public void setMsgParams(Object[] msgParams) {
		this.msgParams = msgParams;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public Map<String, Object> getDataMap() {
		return dataMap;
	}

	public void setDataMap(Map<String, Object> dataMap) {
		this.dataMap = dataMap;
	}

}
