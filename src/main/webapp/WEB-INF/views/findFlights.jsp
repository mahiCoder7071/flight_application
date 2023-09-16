<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Search Flight</title>
</head>
<body><center>
<h2>Find Flights</h2></center>
<form action="findFlightsDetails" method="post">
<table align="center" >
	<tr>
		<td>From</td>
		<td><input type="text" name="from"/></td>
	
		<td>To</td>
		<td><input type="text" name="to"/></td>
	
		<td>Departure Date</td>
		<td><input type="text" name="departureDate"/></td>
	
		<td><input type="submit" value="search"/></td>
	</tr>
</table>
</form>
</body>
</html>