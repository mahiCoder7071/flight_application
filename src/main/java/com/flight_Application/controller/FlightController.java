package com.flight_Application.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.flight_Application.entity.Flight;
import com.flight_Application.service.FlightService;

@Controller
public class FlightController {
@Autowired
private FlightService flightSer;

@RequestMapping("/findFlightsDetails")
public String findAllFlights(
		@RequestParam("from") String from,
		@RequestParam("to") String to,
		@RequestParam("departureDate") @DateTimeFormat(pattern="yyyy-MM-dd") Date departureDate,
		ModelMap model
		)
{
//	System.out.println(from);
//	System.out.println(to);
//	System.out.println(departureDate);
	List<Flight> flights=flightSer.findAllFlight(from,to,departureDate);
	System.out.println(flights);
	model.addAttribute("flights",flights);
	return"listOfFlights";
}
@RequestMapping("/showCompleteReservation")
   public String showReservation(@RequestParam("id") long id,ModelMap model)
    {
	      Flight flight = flightSer.findFlightsById(id);
	      //System.out.println(flight.getDepartureDate());
	  
	      model.addAttribute("flight", flight);
        return"showReservation";	 
    }

}
