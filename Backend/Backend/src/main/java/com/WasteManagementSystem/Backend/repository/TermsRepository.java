package com.WasteManagementSystem.Backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.WasteManagementSystem.Backend.entity.Terms;



public interface TermsRepository extends JpaRepository<Terms, Integer>{
	
}