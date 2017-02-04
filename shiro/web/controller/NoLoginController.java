package com.bjsxt.shiro.web.controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class NoLoginController
{
	@RequestMapping("/login")
	public String login()
	{
		System.out.println("=====login=====");
		return "login";
	}

	/**
	 * 登陆提交
	 * 
	 * @return
	 * @throws Exception 
	 */
	@RequestMapping("/loginSubmit")
	public String loginSubmit(HttpServletRequest request) throws Exception
	{
		System.out.println("=====loginSubmit=====");
		// shiro在认证过程中出现错误后将异常类路径通过request返回
		String exceptionClassName = (String) request.getAttribute("shiroLoginFailure");
		if (exceptionClassName != null)
		{
			if (UnknownAccountException.class.getName().equals(exceptionClassName))
			{
				throw new Exception("账号不存在");
			} else if (IncorrectCredentialsException.class.getName().equals(exceptionClassName))
			{
				throw new Exception("用户名/密码错误");
			} else if ("randomCodeError".equals(exceptionClassName))
			{
				throw new Exception("验证码错误");
			} else
			{
				throw new Exception(exceptionClassName);// 最终在异常处理器生成未知错误
			}
		}
		return "login";
	}
	
	@RequestMapping("/refuse")
	public String refuse()
	{
		System.out.println("-------refuse------");
		return "/refuse"; 
	}
}
