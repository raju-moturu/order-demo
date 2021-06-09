package com.alyx.flights.entities.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alyx.flights.entities.Reservation;


public interface ReservationRepository extends JpaRepository<Reservation, Long> {

}
