<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<%
	Locale locale = request.getLocale();//获取来访者的区域信息
	ResourceBundle rb = ResourceBundle.getBundle("message",locale);
	 %>
	 
  <head>
    <title><%=rb.getString("jsp.login.title")%></title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
    <form action="">
    	<%=rb.getString("jsp.login.username")%>：<input/><br/>
    	<%=rb.getString("jsp.login.password")%>：<input/><br/>
    	<input type="submit" value="<%=rb.getString("jsp.login.submit")%>"/>
    </form>
  </body>
</html>
