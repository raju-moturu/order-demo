package com.alyx.flights.services;

import com.alyx.flights.dto.ReservationRequest;
import com.alyx.flights.entities.Reservation;

public interface ReservationService {

	public Reservation bookFlight(ReservationRequest request);
}
