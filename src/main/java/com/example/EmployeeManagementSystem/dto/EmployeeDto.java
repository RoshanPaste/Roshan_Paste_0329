package com.example.EmployeeManagementSystem.dto;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class EmployeeDto {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long employeeId;
    private String employeeFirstName;
    private String employeeLastName;
    private String email;
    private int age;
    private String address;
    private String contact;
    private String dateOfJoining;

    private boolean isActive;
    private String createdBy;
    private LocalDateTime createdDate;
    private String updatedBy;
    private LocalDateTime updatedDate;
}
