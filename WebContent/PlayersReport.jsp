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

<h2>PLeague Teams Players Report</h2><hr/>

<table border="1" cellspacing="0" cellpadding="3">

<tr>
	<th>Player Id</th>
	<th>Player Name</th>
	<th>Club Name</th>
	<th>Position</th>
	<th>Country</th>
</tr>

<soham:iterator value="teamlist">

<tr>
	<td><soham:property value="playerno"/></td>
	<td><soham:property value="playername"/> </td>
	<td><soham:property value="club"/> </td>
	<td><soham:property value="position"/> </td>
	<td><soham:property value="country"/> </td>
</tr>

</soham:iterator>



</table>


</body>
</html>