package com.alyx.flights.entities.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alyx.flights.entities.Passenger;

public interface PassengerRepository extends JpaRepository<Passenger, Long> {

}
