package com.bjsxt.shiro.web.service;

import java.util.List;

import com.bjsxt.shiro.web.pojo.AMenu;
import com.bjsxt.shiro.web.pojo.APermission;

public interface IPermissionService
{
	/**
	 * 根据用户id查询菜单
	 * @param id
	 * @return
	 */
	List<AMenu> findMenuByUser(int id);

	/**
	 * 根据用户id查询授权项
	 * @param id
	 * @return
	 */
	List<APermission> findPermissionByUser(int id);

}
