package com.flight_Application.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.flight_Application.entity.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation , Long>{

}
