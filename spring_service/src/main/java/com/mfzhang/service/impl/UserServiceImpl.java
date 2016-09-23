package com.mfzhang.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mfzhang.api.bean.User;
import com.mfzhang.api.service.UserService;
import com.mfzhang.component.domain.ServiceResult;
import com.mfzhang.mapper.UserMapper;

/**
 * 用户服务
 *
 * @author mingfei.zhang
 * @date 2016年8月28日-下午4:45:31
 */
@Service("userService")
public class UserServiceImpl implements UserService {

	// @Autowired
	private UserMapper userMapper;
	
	@Override
	public ServiceResult<Integer> addUser(User user) {
		
		return null;
	}

}
