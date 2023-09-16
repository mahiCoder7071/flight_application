package com.flight_Application.RestController;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.flight_Application.entity.Reservation;
import com.flight_Application.payload.ReservationRequestUpdate;
import com.flight_Application.repository.ReservationRepository;

@RestController


public class ReservationRestController {
	@Autowired
	private ReservationRepository reservationRepo;
	//localhost:8080/reservation/1
@RequestMapping("/reservation/{id}")
 public Reservation findReservation(@PathVariable("id") Long id )
 {
	Optional<Reservation> findById = reservationRepo.findById(id);
	Reservation reservation = findById.get();
	return reservation;
 }
@RequestMapping("/reservation")
public Reservation updateReservation(@RequestBody ReservationRequestUpdate request )
{
	Optional<Reservation> findById = reservationRepo.findById(request.getId());
	Reservation reservation = findById.get();
	reservation.setCheckedIn(request.isCheckedIn());
	reservation.setNumberOfBags(request.getNumberOfBags());
	Reservation save = reservationRepo.save(reservation);
	return save;
}
}
