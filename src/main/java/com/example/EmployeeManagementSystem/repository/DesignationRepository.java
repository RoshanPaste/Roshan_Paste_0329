package com.example.EmployeeManagementSystem.repository;

import com.example.EmployeeManagementSystem.entity.Designation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DesignationRepository extends JpaRepository<Designation, Integer> {
}
