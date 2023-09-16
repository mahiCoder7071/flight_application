package com.flight_Application.service.impl;

import com.flight_Application.entity.Flight;
import com.flight_Application.entity.Passenger;
import com.flight_Application.entity.Reservation;
import com.flight_Application.payload.ReservationDto;
import com.flight_Application.repository.FlightRepository;
import com.flight_Application.repository.PassengerRepository;
import com.flight_Application.repository.ReservationRepository;

import com.flight_Application.service.ReservationService;
import com.flight_Application.util.Email;
import com.flight_Application.util.PDFGenerator;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReservationServiceImpl implements ReservationService{
	@Autowired 
	private PassengerRepository passengerRepo;
	@Autowired 
	private ReservationRepository resRepo;
	@Autowired 
	private FlightRepository flightRepo;
	@Autowired 
	private PDFGenerator pdFGenerator;
	@Autowired 
	private Email email;
	@Override
	public Reservation bookFlights(ReservationDto reservation) {
	    Passenger passenger =new Passenger();
		passenger.setFirstName(reservation.getFirstName());
		passenger.setMiddleName(reservation.getMiddleName());
		passenger.setLastName(reservation.getLastName());
		passenger.setEmail(reservation.getEmail());
		passenger.setMobile(reservation.getMobile());
		System.out.println(reservation.getFirstName());
		System.out.println(reservation.getMiddleName());
		System.out.println(reservation.getLastName());
		System.out.println(reservation.getEmail());
		System.out.println(reservation.getMobile());
		passengerRepo.save(passenger);
	    System.out.println(reservation);
     	Long flightId=reservation.getFlightId();
  		System.out.println(flightId);
		Optional<Flight> findById = flightRepo.findById(reservation.getFlightId());
		Flight flight = findById.get();
		
		flightRepo.save(flight);
	
	  Reservation res=new Reservation();
		res.setFlight(flight);
		res.setPassenger(passenger);
		res.setCheckedIn(false);
		res.setNumberOfBags(0);
		Reservation result= resRepo.save(res);
		String filepath="E:\\sts IDE\\flight_Application\\alltickets\\reservation"+res.getId()+".pdf";
		   pdFGenerator.generatePdf(res, filepath);	
		   email.SendMessage(res.getPassenger().getEmail(), filepath);
		return result;
      	
 	}

	
//	@Override
//	public void bookFlightsId(ReservationDto reservationDto) {
//		Reservation res=new Reservation();
//		System.out.println(res);
//	}
}
