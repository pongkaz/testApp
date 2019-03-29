package com.scifisoft.TestApp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.scifisoft.TestApp.entities.Employee;

public interface EmpRepository extends JpaRepository<Employee, Long> {

	
	
}
