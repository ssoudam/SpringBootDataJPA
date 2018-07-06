package com.marketforbes.boot;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SpringJPAService {
	
	@Autowired
	SpringTestRepository springRepository;

	
	public List<Employee>  getAllEmployees(){
		
		return springRepository.findAll();
		
		
	}
	
	public Optional<Employee> findById(int id) {
		
		return springRepository.findById(id);
		
	}
	
}
