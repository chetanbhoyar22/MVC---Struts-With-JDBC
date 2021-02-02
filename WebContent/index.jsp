<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="/struts-tags" prefix="soham" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h2>JDBC Activities in Struts 2.5 MVC</h2><hr/>

<a href="NewAccount.jsp">New Account</a><br/>
<a href="teamsreport">Teams Report</a><br/>
<a href="celeblist">Celebrities List</a>
<br/><hr/>

<h3>Entry Code Verification</h3>
<form name="frm" method="post" action="check">
<table>
	<tr>
		<td>Name : </td>
		<td>
			<soham:textfield name="username"></soham:textfield>
		</td>
		<td>
			<soham:fielderror fieldName="username" cssStyle="color:red;list-style:none;"></soham:fielderror>
		</td>
	</tr>
	<tr>
		<td>Code : </td>
		<td>
			<soham:password name="code"></soham:password>
		</td>
		<td>
			<soham:fielderror fieldName="code" cssStyle="color:red;list-style:none;"></soham:fielderror>
		</td>
	</tr>
	<tr>
		<td>
			<input type="submit" value="Submit"/>
		</td>
	</tr>
</table>
</form>
</body>
</html>