package com.mfzhang.api.bean;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 小刀
 *
 * @author mingfei.zhang
 * @date 2016年9月16日-上午10:42:52
 */
public class Knife implements Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 5385513414156818824L;

	private Integer id;
	private BigDecimal price;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

}
