package com.bjsxt.shiro.web.pojo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * 用户
 * 
 * @author wangshSxt
 *
 */
public class AUsers implements Serializable
{
	private int id;
	private String userName;
	private String pwd;
	private String salt = "test";

	private List<AMenu> menuList = new ArrayList<AMenu>();
	private List<APermission> permissionList = new ArrayList<APermission>();

	public int getId()
	{
		return id;
	}

	public void setId(int id)
	{
		this.id = id;
	}

	public String getUserName()
	{
		return userName;
	}

	public void setUserName(String userName)
	{
		this.userName = userName;
	}

	public String getPwd()
	{
		return pwd;
	}

	public void setPwd(String pwd)
	{
		this.pwd = pwd;
	}

	public String getSalt()
	{
		return salt;
	}

	public void setSalt(String salt)
	{
		this.salt = salt;
	}

	public List<AMenu> getMenuList()
	{
		return menuList;
	}

	public void setMenuList(List<AMenu> menuList)
	{
		this.menuList = menuList;
	}

	public List<APermission> getPermissionList()
	{
		return permissionList;
	}

	public void setPermissionList(List<APermission> permissionList)
	{
		this.permissionList = permissionList;
	}
}
