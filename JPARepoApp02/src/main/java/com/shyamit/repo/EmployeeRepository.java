package com.shyamit.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shyamit.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

}
