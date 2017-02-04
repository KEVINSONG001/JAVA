package com.bjsxt.shiro.web;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.annotation.Resource;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;

import com.bjsxt.shiro.web.pojo.AMenu;
import com.bjsxt.shiro.web.pojo.APermission;
import com.bjsxt.shiro.web.pojo.AUsers;
import com.bjsxt.shiro.web.service.IPermissionService;
import com.bjsxt.shiro.web.service.IUsersService;

/**
 * 实现自己的WebRealm
 * 
 * @author wangshSxt
 *
 */
public class MyWebRealm extends AuthorizingRealm
{
	@Resource
	private IUsersService usersService;
	@Resource
	private IPermissionService permissionService;

	/**
	 * 用于授权
	 */
	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection paramPrincipalCollection)
	{
		System.out.println("===用于授权=========doGetAuthorizationInfo======");
		// 获取用户名
		AUsers currentUser = (AUsers) paramPrincipalCollection.getPrimaryPrincipal();
	
		SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
		Set<String> permission = new HashSet<String>();
		for (APermission p : currentUser.getPermissionList())
		{
			permission.add(p.getPercode());
		}
		info.addStringPermissions(permission);
		return info;
	}

	/**
	 * 用于验证
	 */
	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken paramAuthenticationToken)
			throws AuthenticationException
	{
		/* 从Shiro获取用户名 */
		String usersName = paramAuthenticationToken.getPrincipal() + "";
		System.out.println("======用于验证===doGetAuthenticationInfo======" + usersName);
		/* 模拟登陆 */
		AUsers users = this.usersService.login(usersName);

		/* 查询用户所属的菜单 */
		List<AMenu> menuList = this.permissionService.findMenuByUser(users.getId());

		/* 查询用户所属的权限 */
		List<APermission> permissionList = this.permissionService.findPermissionByUser(users.getId());
		users.setMenuList(menuList);
		users.setPermissionList(permissionList);
		
		if (users == null)
		{
			return null;
		}
		SimpleAuthenticationInfo info = new SimpleAuthenticationInfo(users, users.getPwd(),
				ByteSource.Util.bytes(users.getSalt()), getName());
		return info;
	}
}
