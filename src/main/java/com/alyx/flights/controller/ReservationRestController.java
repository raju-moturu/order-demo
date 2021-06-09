package com.alyx.flights.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alyx.flights.dto.ReservationUpdateRequest;
import com.alyx.flights.entities.Reservation;
import com.alyx.flights.entities.repo.ReservationRepository;

@RestController
@CrossOrigin
public class ReservationRestController {
	
	@Autowired
	private ReservationRepository reservationRepo;

	@GetMapping("/reservation/{id}")
	public Reservation showReservation(@PathVariable("id") Long id) {
		return reservationRepo.getOne(id);
	}
	
	@PostMapping("/reservation")
	public Reservation updateReservationRequest(@RequestBody ReservationUpdateRequest request) {
		Reservation reservation=reservationRepo.getOne(request.getId());
		reservation.setNumberOfBags(request.getNumberOfBags());
		reservation.setCheckedIn(request.isCheckedIn());
		return reservationRepo.save(reservation);
	}
}
