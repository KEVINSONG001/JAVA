package com.bjsxt.shiro.web.pojo;

import java.io.Serializable;

/**
 * 存储的是授权项 users:delete,users:update
 * 
 * @author wangshSxt
 *
 */
public class APermission implements Serializable
{
	private String percode;

	public String getPercode()
	{
		return percode;
	}

	public void setPercode(String percode)
	{
		this.percode = percode;
	}
}
