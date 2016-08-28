package com.mfzhang.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mfzhang.api.bean.vo.UserAddVo;
import com.mfzhang.api.service.UserService;
import com.mfzhang.component.domain.Result;

/**
 * 用户
 *
 * @author mingfei.zhang
 * @date 2016年8月28日-下午8:00:24
 */
@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userService;
	
	/**
	 * 添加用户
	 * 
	 * @param UserAddVo
	 * @param bindingResult
	 * @return
	 */
	@RequestMapping(value="/addUser", method=RequestMethod.POST, produces=MediaType.APPLICATION_JSON_UTF8_VALUE)
	@ResponseBody
	public Result<Boolean> addUser(@RequestBody UserAddVo UserAddVo, BindingResult bindingResult) {
		
		if (bindingResult.hasErrors()) {
			
		}
		
		return null;
	}
	
}
