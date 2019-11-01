<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.Date" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>index</title>
</head>
<body>
hello,world!<br/>
中文<br/>
<% 
	response.setHeader("refresh", "0.5");
	Date d = new Date();
	out.print(d);
%>
</body>
</html>