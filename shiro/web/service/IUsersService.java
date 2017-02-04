package com.bjsxt.shiro.web.service;

import com.bjsxt.shiro.web.pojo.AUsers;

public interface IUsersService
{
	/**
	 * 登陆
	 * 
	 * @param userName
	 * @return
	 */
	AUsers login(String userName);
}
