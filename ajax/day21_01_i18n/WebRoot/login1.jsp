<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	 <fmt:setLocale value="${pageContext.request.locale}"/>
	 <fmt:setBundle basename="message" var="msg" scope="page"/>
	 
  <head>
    <title><fmt:message key="jsp.login.title" bundle="${msg}"/></title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
    <form action="">
    	<fmt:message key="jsp.login.username" bundle="${msg}"/>：<input/><br/>
    	<fmt:message key="jsp.login.password" bundle="${msg}"/>：<input/><br/>
    	<input type="submit" value="<fmt:message key="jsp.login.submit" bundle="${msg}"/>"/>
    </form>
    <!-- 日期输出 -->
    <%
    pageContext.setAttribute("now", new Date());
     %>
     <fmt:formatDate value="${now}" type="both" dateStyle="long" timeStyle="long"/><br/>
     <fmt:formatDate value="${now}" pattern="yyyy-MM-dd HH:mm:ss"/><br/>
  </body>
</html>
