package com.devsuperior.bds03.repositories;

import com.devsuperior.bds03.entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
