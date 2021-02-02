<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>New Account Registration</h2>
<hr/>
<form name="frm" method="post" action="register">
<table>
	<tr>
		<td>Account No</td>
		<td>
			<input type="text" name="accountno"/>
		</td>
	</tr>	
	<tr>
		<td>Account Name</td>
		<td>
			<input type="text" name="accountnm"/>
		</td>
	</tr>
	<tr>
		<td>Account Type</td>
		<td>
			<select name="accounttype">
				<option value="saving">Saving</option>
				<option value="current">Current</option>
				<option value="fixed">Fixed</option>
				<option value="ppf">Ppf</option>
			</select>

		</td>
	</tr>
	<tr>
		<td>Balance</td>
		<td>
			<input type="text" name="balance"/>
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