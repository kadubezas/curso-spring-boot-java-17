package com.kadubezas.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kadubezas.course.entities.Product;
import com.kadubezas.course.repositories.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository userRepository;
	
	public List<Product> findAll(){
		return userRepository.findAll();
	}
	
	public Product findById(Long id) {
		Optional<Product> objet = userRepository.findById(id);
		
		return objet.get();
	}
}
