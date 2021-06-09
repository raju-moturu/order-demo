package com.alyx.flights.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.alyx.flights.dto.ReservationRequest;
import com.alyx.flights.entities.Flight;
import com.alyx.flights.entities.Reservation;
import com.alyx.flights.entities.repo.FlightRepository;
import com.alyx.flights.services.ReservationServiceImpl;

@Controller
public class ReservationController {
	
	@Autowired
	private FlightRepository flightRepo;
	
	@Autowired
	private ReservationServiceImpl reservationService;
	

	@RequestMapping("/showCompleteReservation")
	public String showCompleteReservation(@RequestParam("flightId") long flightId,ModelMap modelMap) {
		Flight flight=flightRepo.getOne(flightId);
		modelMap.addAttribute("flight", flight);
		return "completeReservation";
	}
	
	@RequestMapping("/completeReservation")
	public String completeReservation(ReservationRequest reservation,ModelMap modelMap ) {
		Reservation reservation1 = reservationService.bookFlight(reservation);
		modelMap.addAttribute("msg", "reservation completed Successfull"+reservation1.getId());
		
		return "reservationConfirmation";
	}
}
