<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false" %>
    <%@ page import="java.time.LocalDateTime" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Help Page</title>
</head>
<body>
	<%
	/* String name = (String)request.getAttribute("name");
	 Integer rollnumber = (Integer)request.getAttribute("rollnumber");
	 LocalDateTime time = (LocalDateTime)request.getAttribute("time");*/
	%>
	<h1>Hello my name is <%--<%=name %>--%> ${name}</h1>
	<h2>This is help page</h2>
	<h2>My roll number is <%--<%=rollnumber %>--%> ${rollnumber}</h2>
	<h2>Date And Time is <%--<%=time.toString() --%> ${time}</h2>
	<hr>
	<c:forEach var="item" items="${marks }">
		<h1>${item}</h1>
	</c:forEach>
</body>
</html>