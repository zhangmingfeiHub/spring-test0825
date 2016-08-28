package com.mfzhang.api.bean;

import java.io.Serializable;
import java.util.Date;

/**
 * 用户
 *
 * @author mingfei.zhang
 * @date 2016年8月28日-下午3:11:55
 */
public class User implements Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 6358744286191884379L;

	private Integer id;
	private String username; // 名称
	private String password; // 密码
	private Integer age; // 年龄
	private Integer sex; // 性别：0（男）, 1（女）, -1（未知）
	private Date createDate;
	private String createUser;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public String getCreateUser() {
		return createUser;
	}

	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}

	public Integer getSex() {
		return sex;
	}

	public void setSex(Integer sex) {
		this.sex = sex;
	}

}
