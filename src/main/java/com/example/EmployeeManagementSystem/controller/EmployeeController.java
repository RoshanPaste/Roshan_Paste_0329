package com.example.EmployeeManagementSystem.controller;

import com.example.EmployeeManagementSystem.dto.EmployeeDto;
import com.example.EmployeeManagementSystem.entity.Employee;
import com.example.EmployeeManagementSystem.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.HttpStatus.CREATED;

@RestController
@RequestMapping("/ems")
public class EmployeeController {


    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/addData")
    public ResponseEntity<Employee> addData(EmployeeDto employeeDto) {
        return new ResponseEntity<>(employeeService.addData(employeeDto), CREATED);
    }
}




















