package io.employees.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import io.employees.entity.Employee;
import io.employees.repos.EmployeeRepository;

@RestController()
public class EmployeeRestController {

	@Autowired
	EmployeeRepository empRepo;

	@GetMapping("employee/{id}")
	public ResponseEntity<Employee> getEmployee(@PathVariable("id") long id) {
		Employee employee = empRepo.findById(id).get();
		return new ResponseEntity<Employee>(employee, HttpStatus.OK);
	}
}
