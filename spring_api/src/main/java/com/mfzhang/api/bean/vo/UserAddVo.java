package com.mfzhang.api.bean.vo;

import java.io.Serializable;

/**
 * 添加用户信息类
 *
 * @author mingfei.zhang
 * @date 2016年8月28日-下午8:07:18
 */
public class UserAddVo implements Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 5687556038504032728L;

	private String username; // 用户名称
	private String password; // 密码
	private Integer age; // 年龄
	private Integer sex; // 性别

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

	public Integer getSex() {
		return sex;
	}

	public void setSex(Integer sex) {
		this.sex = sex;
	}

}
