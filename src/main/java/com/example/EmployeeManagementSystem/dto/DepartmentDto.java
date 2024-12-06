package com.example.EmployeeManagementSystem.dto;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class DepartmentDto {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int managerId;
    private int employeeId;

    private boolean isActive;
    private String createdBy;
    private LocalDateTime createdDate;
    private String updatedBy;
    private LocalDateTime updatedDate;
}
