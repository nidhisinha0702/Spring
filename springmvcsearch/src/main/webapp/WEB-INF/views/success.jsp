<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Name is ${student.name}</h1>
<h1>Student Id is ${student.id}</h1>
<h1>Student DOB is ${student.date}</h1>
<c:forEach items="${student.subjects}" var="cr">
<h1>Courses are ${cr}</h1></c:forEach>
<h1>Student gender is ${student.gender}</h1>
<hr>
<h1>Address Street is ${student.address.street}</h1>
<h1>Address Street is ${student.address.city}</h1>
</body>
</html>