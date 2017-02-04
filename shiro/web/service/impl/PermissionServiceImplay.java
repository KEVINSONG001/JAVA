package com.bjsxt.shiro.web.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.bjsxt.shiro.web.pojo.AMenu;
import com.bjsxt.shiro.web.pojo.APermission;
import com.bjsxt.shiro.web.service.IPermissionService;

@Service("permissionService")
public class PermissionServiceImplay implements IPermissionService
{
	@Override
	public List<AMenu> findMenuByUser(int id)
	{
		List<AMenu> menuList = new ArrayList<AMenu>();
		AMenu menu = new AMenu();
		menuList.add(menu);
		return menuList;
	}

	@Override
	public List<APermission> findPermissionByUser(int id)
	{
		List<APermission> permissionList = new ArrayList<APermission>();
		APermission permission = new APermission();
		permission.setPercode("item:index");
		permissionList.add(permission);
		
		/*APermission permission1 = new APermission();
		permission1.setPercode("item:query");
		permissionList.add(permission1);*/
		return permissionList;
	}

}
