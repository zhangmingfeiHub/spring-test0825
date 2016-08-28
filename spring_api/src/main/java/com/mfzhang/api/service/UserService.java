package com.mfzhang.api.service;

import com.mfzhang.api.bean.User;
import com.mfzhang.component.domain.ServiceResult;

/**
 * 用户服务
 *
 * @author mingfei.zhang
 * @date 2016年8月28日-下午3:49:10
 */
public interface UserService {

	/**
	 * 添加用户信息
	 * 
	 * @param user 用户对象
	 * @return
	 */
	public ServiceResult<Integer> addUser(User user);
	
}
