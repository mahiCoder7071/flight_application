package com.flight_Application.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.flight_Application.entity.Passenger;

public interface PassengerRepository extends JpaRepository<Passenger , Long> {

}
