package com.example.EmployeeManagementSystem.controller;

import com.example.EmployeeManagementSystem.dto.DepartmentDto;
import com.example.EmployeeManagementSystem.entity.Department;
import com.example.EmployeeManagementSystem.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.HttpStatus.CREATED;

@RestController
@RequestMapping("/ems")
public class DepartmentController {


    @Autowired
    private DepartmentService departmentService;

    @PostMapping("/addData")
    public ResponseEntity<Department> addData(DepartmentDto departmentDto){
        return new ResponseEntity<>(DepartmentService.addData(departmentDto), CREATED);
    }
}
