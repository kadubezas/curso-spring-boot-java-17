package com.kadubezas.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kadubezas.course.entities.Category;
import com.kadubezas.course.repositories.CategoryRepository;

@Service
public class CategoryService {
	
	@Autowired
	private CategoryRepository userRepository;
	
	public List<Category> findAll(){
		return userRepository.findAll();
	}
	
	public Category findById(Long id) {
		Optional<Category> objet = userRepository.findById(id);
		
		return objet.get();
	}
}
