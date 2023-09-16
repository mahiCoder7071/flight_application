<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Flight Details</h2>
<table >
      <tr>
      	<td><b>Flight Number :</b></td>
      	<td>${flight.flightNumber}</td>
      </tr>
      <tr>
      	<td><b>Operating Airlines :</b></td>
      	<td>${flight.operatingAirlines}</td>
      </tr>
      <tr>
      	<td><b>Departure City :</b></td>
      	<td>${flight.departureCity}</td>
      </tr>
      <tr>
      	<td><b>Arrival City:</b></td>
      	<td>${flight.arrivalCity}</td>
      </tr>
      <tr>
      	<td><b>Departure Date :</b></td>
      	<td>${flight.dateOfDeparture}</td>
      </tr>
      <tr>
      	<td><b>Estimated Departure Time :</b></td>
      	<td>${flight.estimatedDepartureTime}</td>
      </tr>
      </table>
      <hr>
     <b>Passenger Details</b>
     <table>
     <form action="confirmReservatinTicket" method="post">
     	<tr>
     	<td>First Name</td>
     	<td><input type="text" name="firstName"/></td>
     	</tr>
     	<tr>
     	<td>Middle Name</td>
     	<td><input type="text" name="middleName"/></td>
     	</tr>
     	<tr>
     	<td>Last Name</td>
     	<td><input type="text" name="lastName"/></td>
     	</tr>     	
     	<tr>
     	<td>Email</td>
     	<td><input type="text" name="email"/></td>
     	</tr>
     	<tr>
     	<td>Mobile</td>
     	<td><input type="text" name="mobile"/></td>
     	</tr>
     	<tr>
     	<td><input type="hidden" name="flightId" value="${flight.id}"/></td>
     	</tr>
     	
    

<hr>
<h2>Payment Here</h2>

     
     	<tr>
     	<td>Card Number</td>
     	<td><input type="text" name="cardNumber"/></td>
     	</tr>
     	<tr>
     	<td>Card Holder Name</td>
     	<td><input type="text" name="cardHolderName"/></td>
     	</tr>
     	<tr>
     	<td>Expiry Date</td>
     	<td><input type="text" name="expiryDate"/></td>
     	
     	<td>CVV</td>
     	<td><input type="text" name="cvv"/></td>
     	</tr>
     	<tr>
     	<td>Enter OTP </td>
     	<td><input type="text" name="otp"/></td>
     	</tr>
       	<tr>
     	<td><input type="submit" value="Submit"/></td>
     	</tr>
     	
     </form>  
</table>
</body>
</html>