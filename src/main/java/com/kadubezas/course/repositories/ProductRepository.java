package com.kadubezas.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kadubezas.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
	
}
