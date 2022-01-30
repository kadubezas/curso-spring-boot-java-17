package com.kadubezas.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kadubezas.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
}
