package com.example.EmployeeManagementSystem.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "employeeInfo")
public class Employee {

    @Id
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
    private String createdDate;
    private String updatedBy;
    private String updatedDate;
}
