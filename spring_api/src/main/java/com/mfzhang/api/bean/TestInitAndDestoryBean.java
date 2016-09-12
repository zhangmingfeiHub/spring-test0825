package com.mfzhang.api.bean;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 * Bean的初始化和销毁的另一种方式
 *
 * @author mingfei.zhang
 * @date 2016年9月12日-上午10:01:20
 */
public class TestInitAndDestoryBean implements InitializingBean, DisposableBean {

	/**
	 * 销毁
	 */
	@Override
	public void destroy() throws Exception {
		System.out.println("---TestInitAndDestoryBean.destroy---");
	}

	/**
	 * 初始化
	 */
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("---TestInitAndDestoryBean.afterPropertiesSet---");
	}

}
