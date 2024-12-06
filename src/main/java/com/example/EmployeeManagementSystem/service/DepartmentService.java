package com.example.EmployeeManagementSystem.service;

import com.example.EmployeeManagementSystem.dto.DepartmentDto;
import com.example.EmployeeManagementSystem.entity.Department;
import com.example.EmployeeManagementSystem.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class DepartmentService {

    @Autowired
    static DepartmentRepository departmentRepository;

    public static Department addData(DepartmentDto departmentDto) {
        Department department = new Department();
        department.setDepartmentId(0);
        department.setDepartmentName(department.getDepartmentName());
        department.setManagerId(department.getManagerId());
        department.setActive(true);
        department.setCreatedBy(department.getCreatedBy());
        department.setCreatedDate(LocalDateTime.now());
        department.setUpdatedBy(department.getUpdatedBy());
        department.setUpdatedDate(LocalDateTime.now());
        return departmentRepository.save(department);
    }
}
