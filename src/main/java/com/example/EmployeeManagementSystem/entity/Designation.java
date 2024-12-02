package com.example.EmployeeManagementSystem.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Data
@Table(name = "employeedesignation")
public class Designation {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private int designationId;
        private String designationName;

        private boolean isActive;
        private String createdBy;
        private LocalDateTime createdDate;
        private String updatedBy;
        private LocalDateTime updatedDate;
}