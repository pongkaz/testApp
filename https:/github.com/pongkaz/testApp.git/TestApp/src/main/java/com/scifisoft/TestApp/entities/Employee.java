package com.scifisoft.TestApp.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Employee {
 @Id
 private Long Id;
 private String Name;
 public Long getId() {
	return Id;
}
public void setId(Long id) {
	Id = id;
}
public String getName() {
	return Name;
}
public void setName(String name) {
	Name = name;
}
public Employee(Long id, String name) {
	
	Id = id;
	Name = name;
}
public Employee() {
	
}
 
 
	
	
	
}
