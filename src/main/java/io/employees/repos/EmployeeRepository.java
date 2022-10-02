package io.employees.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import io.employees.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
