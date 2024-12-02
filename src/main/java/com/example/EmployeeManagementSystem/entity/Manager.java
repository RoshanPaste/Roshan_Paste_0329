package com.example.EmployeeManagementSystem.entity;


import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Data
@Table(name = "managerInfo")
public class Manager {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int managerId;
    private int employeeId;

    private boolean isActive;
    private String createdBy;
    private String createdDate;
    private String updatedBy;
    private String updatedDate;
}
