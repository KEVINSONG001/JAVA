package com.bjsxt.shiro.web.service.impl;

import org.springframework.stereotype.Service;

import com.bjsxt.shiro.web.pojo.AUsers;
import com.bjsxt.shiro.web.service.IUsersService;

@Service("usersService")
public class UsersServiceImpl implements IUsersService
{

	@Override
	public AUsers login(String userName)
	{
		/* 应该从数据库查询用户 */
		AUsers user = new AUsers();
		user.setUserName(userName);
		/* 密码:111111 */
		user.setPwd("4de0fe9cf9f47ce5af891d6182d6c4b7");
		return user;
	}

}
