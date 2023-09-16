<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
 <!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<center><h2>All Flights Available</h2></center>
<table border="1 px" >
	<tr>
		<th>Airlines</th>
		<th>Departure City</th>
		<th>Arrival City</th>
		<th>Departure Date</th>
		<th>Estimated Date</th>
		<th>Choose</th>
	</tr>
		
	<c:forEach var="flights" items="${flights}">
	<tr>
	
		<td>${flights.operatingAirlines}</td>
	    <td>${flights.departureCity}</td> 
	    <td>${flights.arrivalCity}</td>  
	     <td>${flights.dateOfDeparture}</td>  
	    <td>${flights.estimatedDepartureTime}</td>
	    <td><a href="showCompleteReservation?id=${flights.id}">Select</a></td>
	</tr>
	</c:forEach>
</table>

</body>
</html>