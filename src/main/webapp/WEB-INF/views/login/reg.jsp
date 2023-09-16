<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<center><h2>Create New Registeration</h2></center>
<form action="save" method="post">
<table align="center" >
	<tr>
		<td>First Name</td>
		<td><input type="text" name="firstName"/></td>
	</tr>
		<tr>
		<td>Last Name</td>
		<td><input type="text" name="lastName"/></td>
	</tr>
		<tr>
		<td>User Id</td>
		<td><input type="text" name="email"/></td>
	</tr>
		<tr>
		<td>Password</td>
		<td><input type="text" name="password"/></td>
	</tr>
	<tr>
		<td><input type="submit" value="submit"/></td>
	</tr>
</table>
</form>
</body>
</html>