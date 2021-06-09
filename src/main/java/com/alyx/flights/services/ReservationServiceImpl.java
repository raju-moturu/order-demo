package com.alyx.flights.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alyx.flights.dto.ReservationRequest;
import com.alyx.flights.entities.Flight;
import com.alyx.flights.entities.Passenger;
import com.alyx.flights.entities.Reservation;
import com.alyx.flights.entities.repo.FlightRepository;
import com.alyx.flights.entities.repo.PassengerRepository;
import com.alyx.flights.entities.repo.ReservationRepository;

@Service
public class ReservationServiceImpl implements ReservationService {

	@Autowired
	private FlightRepository flightRepo;

	@Autowired
	private ReservationRepository reservationRepo;

	@Autowired
	private PassengerRepository passengerRepo;

	@Override
	public Reservation bookFlight(ReservationRequest request) {
		long flightId = request.getFlightId();
		Flight flight = flightRepo.getOne(flightId);

		Passenger passenger = new Passenger();
		passenger.setFirstName(request.getPassengerFirstName());
		passenger.setLastName(request.getPassengerLastName());
		passenger.setEmail(request.getPassengerEmail());
		passenger.setPhone(request.getPassengerPhone());
		Passenger savedpassenger = passengerRepo.save(passenger);

		Reservation reservation = new Reservation();
		reservation.setFlight(flight);
		reservation.setPassenger(savedpassenger);
		reservation.setCheckedIn(false);

		Reservation savedReservation =reservationRepo.save(reservation);
		return savedReservation;
	}

}
