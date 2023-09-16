package com.flight_Application.repository;

import java.util.*;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.flight_Application.entity.Flight;

public interface FlightRepository extends JpaRepository<Flight , Long>{
//    @Query("from Flight where departureCity=:departureCity,arrivalCity=:arrivalCity,dateOfDeparture=:dateOfDeparture")
//	List<Flight> findflights(@Param("departureCity") String from,@Param("arrivalCity") String to,@Param("dateOfDeparture") Date departureDate);
	 @Query("from Flight where departureCity=:departureCity and arrivalCity=:arrivalCity and dateOfDeparture=:dateOfDeparture")
		List<Flight> findFlights(@Param("departureCity") String from,@Param("arrivalCity") String to,@Param("dateOfDeparture") Date departureDate);

}
