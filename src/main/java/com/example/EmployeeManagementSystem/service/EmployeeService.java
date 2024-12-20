package com.example.EmployeeManagementSystem.service;

import com.example.EmployeeManagementSystem.dto.EmployeeDto;
import com.example.EmployeeManagementSystem.entity.Employee;
import com.example.EmployeeManagementSystem.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;

    public Employee addData(EmployeeDto employeeDto) {
        Employee employee = new Employee();
        employee.setEmployeeId(0L);
        employee.setEmployeeFirstName(employee.getEmployeeFirstName());
        employee.setEmployeeLastName(employee.getEmployeeLastName());
        employee.setEmail(employeeDto.getEmail());
        employee.setActive(true);
        employee.setCreatedBy(employeeDto.getCreatedBy());
        employee.setCreatedDate(LocalDateTime.now());
        employee.setUpdatedBy(employeeDto.getUpdatedBy());
        employee.setUpdatedDate(LocalDateTime.now());
        return employeeRepository.save(employee);
    }

}


























