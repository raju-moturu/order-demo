package com.alyx.flights.entities.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alyx.flights.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

	User findByEmail(String email);

}
