package com.alyx.flights.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.alyx.flights.entities.Flight;
import com.alyx.flights.entities.repo.FlightRepository;

@Controller
public class FlightController {

	@Autowired
	private FlightRepository flightRepo;
	
	/*
	@RequestMapping("/findFlights")
	public String fingFlights(@RequestParam("from") String from,@RequestParam("to") String to,ModelMap modelMap) {
		 List<Flight> flights=flightRepo.findFlightss(from,to);
		  modelMap.addAttribute("flights", flights); 
		  return "displayFlights";
	}
	*/
	
	@RequestMapping("/findFlights")
	public String fingFlights(@RequestParam("from") String from,@RequestParam("to") String to,
			@RequestParam("departureDate")  String dateOfDeparture,ModelMap modelMap) throws Exception {
		
		 Date date1=new SimpleDateFormat("yyyy-MM-dd").parse(dateOfDeparture); 
			List<Flight> flights=flightRepo.findFlights(from,to,date1);
			
				 System.out.println(date1);
				 modelMap.addAttribute("flights", flights); 
			
		
		
		 
		  return "displayFlights";
	}
	
	
	
}
