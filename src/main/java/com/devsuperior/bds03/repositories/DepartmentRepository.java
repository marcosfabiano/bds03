package com.devsuperior.bds03.repositories;

import com.devsuperior.bds03.entities.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Long> {

}
