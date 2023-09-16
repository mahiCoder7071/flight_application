package com.flight_Application.payload;



import com.flight_Application.entity.AbstractEntity;
import com.flight_Application.entity.Flight;
import com.flight_Application.entity.Passenger;

public class ReservationDto {
private long flightId;
private String firstName;
private String middleName;
private String lastName;
private String email;
private String mobile;
private String cardNumber;
private String cardHolderName;
private String expiryDate;
private String cvv;
private String otp;


public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getMiddleName() {
	return middleName;
}
public void setMiddleName(String middleName) {
	this.middleName = middleName;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getMobile() {
	return mobile;
}
public void setMobile(String mobile) {
	this.mobile = mobile;
}
public String getCardNumber() {
	return cardNumber;
}
public void setCardNumber(String cardNumber) {
	this.cardNumber = cardNumber;
}
public String getCardHolderName() {
	return cardHolderName;
}
public void setCardHolderName(String cardHolderName) {
	this.cardHolderName = cardHolderName;
}
public String getExpiryDate() {
	return expiryDate;
}
public void setExpiryDate(String expiryDate) {
	this.expiryDate = expiryDate;
}
public String getCvv() {
	return cvv;
}
public void setCvv(String cvv) {
	this.cvv = cvv;
}
public String getOtp() {
	return otp;
}
public void setOtp(String otp) {
	this.otp = otp;
}
public long getFlightId() {
	return flightId;
}
public void setFlightId(long flightId) {
	this.flightId = flightId;
}

}
