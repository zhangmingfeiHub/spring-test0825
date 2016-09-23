package com.mfzhang.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.mfzhang.advice.Audience;
import com.mfzhang.advice.Audience2;
import com.mfzhang.api.bean.Knife;
import com.mfzhang.api.bean.Ticket;

/**
 * spring java配置类
 *
 * @author mingfei.zhang
 * @date 2016年9月17日-上午11:14:24
 */
@Configuration
public class SpringConfig {

	/**
	 * 创建票对象
	 * 
	 * @return
	 * @author mingfei.zhang, 2016年9月22日 下午6:54:45
	 */
	@Bean(name={"ticket","ticketScope"})
	public Ticket ticket() {
		return new Ticket();
	}
	
	/**
	 * 创建刀对象
	 * 
	 * @return
	 * @author mingfei.zhang, 2016年9月22日 下午6:54:59
	 */
	@Bean
	@Scope("prototype")
	public Knife knife() {
		return new Knife();
	}
	
	/**
	 * 创建观众对象
	 * 
	 * @return
	 * @author mingfei.zhang, 2016年9月22日 下午6:55:56
	 */
	@Bean
	public Audience audience() {
		return new Audience();
	}
	
	/**
	 * 注解切面对象
	 * 
	 * @return
	 * @author mingfei.zhang, 2016年9月22日 下午7:15:54
	 */
	@Bean
	public Audience2 audience2() {
		return new Audience2();
	}
	
}
