package com.flight_Application.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.flight_Application.entity.Passenger;
import com.flight_Application.entity.Reservation;
import com.flight_Application.payload.ReservationDto;
import com.flight_Application.service.ReservationService;

@Controller
public class ReservationController {
	@Autowired
private ReservationService reservationSer;

//
@RequestMapping("/confirmReservatinTicket")
public String confirmTicket(ReservationDto reservation,ModelMap model) {
	
	//System.out.println(reservation.getMobile());
  Reservation res= reservationSer.bookFlights(reservation);
      model.addAttribute("reservation", res);
	return "confirmedPage";
}
//@RequestMapping("/confirmReservatinTicket")
//public String bookStatus(ReservationDto reservationDto,ModelMap model)
//{
//	 reservationSer.bookFlights(reservationDto);
//	//model.addAttribute("reservation", res);
//	return "confirmedPage";
//}
}
