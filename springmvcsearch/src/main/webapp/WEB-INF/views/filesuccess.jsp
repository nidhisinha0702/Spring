<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>File Uploaded result....</title>
</head>
<body>
<h1>${msg}</h1>
<table>
	<tr>
    <td>Upload status: ${message}</td>
  	</tr>
	<tr>
	<td>Original file name</td>
	<td>${file.getOriginalFilename()}</td>
	</tr>
	<tr>
    <td>File Size: ${file.getSize()}</td>
  </tr>
  <tr>
    <td>File Type: ${file.getContentType()}</td>
  </tr>
</table>

</body>
</html>