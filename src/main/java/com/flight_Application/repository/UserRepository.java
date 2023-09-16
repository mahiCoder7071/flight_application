package com.flight_Application.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.flight_Application.entity.User;

public interface UserRepository extends JpaRepository<User , Long> {

	User findByEmail(String email);

}
