<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<%@page import="org.springframework.context.ApplicationContext"%>
<%@page import="org.springframework.web.context.support.WebApplicationContextUtils"%>
<%@page import="com.tobys.dto.HelloSpring"%>

<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Hello world!  
</h1>

<%
ApplicationContext context = WebApplicationContextUtils.getWebApplicationContext(request.getSession().getServletContext());
HelloSpring helloSpring = context.getBean(HelloSpring.class);
out.println(helloSpring.sayHello("Root Context"));
%>
</body>
</html>
