package com.mfzhang.mapper;

import com.mfzhang.api.bean.User;

/**
 * 用户Mapper接口
 *
 * @author mingfei.zhang
 * @date 2016年8月28日-下午4:49:23
 */
public interface UserMapper {
	
	/**
	 * 添加用户信息
	 * 
	 * @param user 用户对象
	 */
	public void createUser(User user);

}
