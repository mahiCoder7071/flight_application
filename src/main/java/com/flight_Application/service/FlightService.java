package com.flight_Application.service;

import java.util.Date;
import java.util.List;

import com.flight_Application.entity.Flight;

public interface FlightService {

	List<Flight> findAllFlight(String from, String to, Date departureDate);

	public Flight findFlightsById(long id);

}
