<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="verifyLogin" method="post">
${error}
<table align="center" >
		<tr>
		<td>User Id</td>
		<td><input type="text" name="email"/></td>
	   </tr>
		<tr>
		<td>Password</td>
		<td><input type="text" name="password"/></td>
	</tr>
	<tr>
		<td><input type="submit" value="login"/></td>
	</tr>
</table>
</form>
</body>
</html>