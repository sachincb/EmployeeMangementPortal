package com.example.demo.service;
import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Employee;
import com.example.demo.repository.EmpRepository;

@Service
public class EmpService {
	
	@Autowired
	private EmpRepository repo;
	
public void addEmp(Employee e) {
	repo.save(e);
}
public List<Employee> getAllEmp(){
	return repo.findAll();
}
public Employee getEmpById(int id) {
	Optional<Employee> e = repo.findById(id);
	if (e.isPresent()) {
		return e.get();
	}
	return null;
}

public void deleteEMp(int id) {
	repo.deleteById(id);
}
}
