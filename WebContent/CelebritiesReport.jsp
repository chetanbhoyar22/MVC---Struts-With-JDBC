<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="soham" uri="/struts-tags" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Celebrity List</h2>
<hr/>
<table border="1" cellspacing="0" cellpadding="4">
	<tr>
		<th>Celebrity Name</th>
		<th>Field</th>
		<th>Country</th>
	</tr>
	<soham:iterator value="celeblist">
	<tr>
		<td><soham:property value="celebname"/> </td>
		<td><soham:property value="field"/> </td>
		<td><soham:property value="country"/> </td>
	</tr>
	</soham:iterator>
	
</table>
</body>
</html>