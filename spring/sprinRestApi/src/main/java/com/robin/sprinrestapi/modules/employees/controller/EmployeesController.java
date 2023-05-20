package com.robin.sprinrestapi.modules.employees.controller;

import com.robin.sprinrestapi.modules.employees.entity.Employee;
import com.robin.sprinrestapi.modules.employees.repository.EmployeeRepositoryDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/employees")
public class EmployeesController {
    EmployeeRepositoryDAO repository;
    @Autowired
    public EmployeesController(EmployeeRepositoryDAO repository) {
        this.repository = repository;
    }
    @GetMapping
    public List<Employee> getAllEmployees() {
        return repository.findAll();
    }
}
