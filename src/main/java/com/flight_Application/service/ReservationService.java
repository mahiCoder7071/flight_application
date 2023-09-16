package com.flight_Application.service;


import com.flight_Application.entity.Reservation;
import com.flight_Application.payload.ReservationDto;

public interface ReservationService {

	//Passenger bookFlightById(ReservationDto reservation);

	public	Reservation bookFlights(ReservationDto reservation);

	//public void  bookFlightsId(ReservationDto reservationDto);

}
