package com.bjsxt.shiro.web.controller;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/head/index")
public class IndexController
{
	/**
	 * 登陆之后 的操作
	 * @return
	 */
	@RequestMapping("/index")
	@RequiresPermissions("item:index")
	public String index()
	{
		System.out.println("=======index=========");
		return "/head/index" ; 
	}
	
	/**
	 * 登陆之后 的操作
	 * @return
	 */
	@RequiresPermissions("item:testOne")
	@RequestMapping("/testOne")
	public String testOne()
	{
		System.out.println("=======testOne=========");
		return "/head/testOne" ; 
	}
	
	/**
	 * 登陆之后 的操作
	 * @return
	 */
	@RequestMapping("/logout")
	public String logout()
	{
		System.out.println("=======logout=========");
		return "/login" ; 
	}
}
