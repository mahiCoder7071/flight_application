package com.flight_Application.service.impl;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flight_Application.entity.Flight;
import com.flight_Application.repository.FlightRepository;

import com.flight_Application.service.FlightService;

@Service
public class FlightServiceImpl implements FlightService{
	 @Autowired
	 private FlightRepository flightRepo;

	@Override
	public List<Flight> findAllFlight(String from, String to, Date departureDate) {
		List<Flight> f=flightRepo.findFlights(from,to,departureDate);
		System.out.println(f);
		return f;
	}

	@Override
	public Flight findFlightsById(long id) {
		Optional<Flight> findById = flightRepo.findById(id);
		Flight flight = findById.get();

		return flight;
	}
}
