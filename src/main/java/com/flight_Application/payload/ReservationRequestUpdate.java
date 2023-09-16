package com.flight_Application.payload;

import javax.persistence.OneToOne;

import com.flight_Application.entity.Flight;
import com.flight_Application.entity.Passenger;

public class ReservationRequestUpdate {
	private long id;
	private boolean checkedIn;
	public void setCheckedIn(boolean checkedIn) {
		this.checkedIn = checkedIn;
	}
	private int numberOfBags;
	private Passenger passenger;
	private Flight flight;
	public boolean isCheckedIn() {
		return checkedIn;
	}
	
	public int getNumberOfBags() {
		return numberOfBags;
	}
	public void setNumberOfBags(int numberOfBags) {
		this.numberOfBags = numberOfBags;
	}
	public Passenger getPassenger() {
		return passenger;
	}
	public void setPassenger(Passenger passenger) {
		this.passenger = passenger;
	}
	public Flight getFlight() {
		return flight;
	}
	public void setFlight(Flight flight) {
		this.flight = flight;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
}
