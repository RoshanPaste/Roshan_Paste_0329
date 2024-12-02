package com.example.EmployeeManagementSystem.repository;

import com.example.EmployeeManagementSystem.entity.Manager;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ManagerRepository extends JpaRepository<Manager, Integer> {
}
