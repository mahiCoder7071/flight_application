package com.flight_Application.payload;

import java.sql.Timestamp;
import java.util.Date;

public class FlightDto extends AbstractEntityDto {

private String flightNumber;
private String operatingAirlines;
private String departureCity;
private String arrivalCity;
private Date dateOfDeparture;
private Timestamp estimatedDepartureTime;
public String getFlightNumber() {
	return flightNumber;
}
public void setFlightNumber(String flightNumber) {
	this.flightNumber = flightNumber;
}
public String getOperatingAirlines() {
	return operatingAirlines;
}
public void setOperatingAirlines(String operatingAirlines) {
	this.operatingAirlines = operatingAirlines;
}
public String getDepartureCity() {
	return departureCity;
}
public void setDepartureCity(String departureCity) {
	this.departureCity = departureCity;
}
public String getArrivalCity() {
	return arrivalCity;
}
public void setArrivalCity(String arrivalCity) {
	this.arrivalCity = arrivalCity;
}
public Date getDepartureDate() {
	return dateOfDeparture;
}
public void setDepartureDate(Date dateOfDeparture) {
	this.dateOfDeparture = dateOfDeparture;
}
public Timestamp getEstimatedDepartureTime() {
	return estimatedDepartureTime;
}
public void setEstimatedDepartureTime(Timestamp estimatedDepartureTime) {
	this.estimatedDepartureTime = estimatedDepartureTime;
}

}
