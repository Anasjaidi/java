package com.robin.sprinrestapi.modules.employees.service;

import com.robin.sprinrestapi.modules.employees.entity.Employee;
import com.robin.sprinrestapi.modules.employees.repository.EmployeeRepositoryDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeesService {
    private EmployeeRepositoryDAO repository;
    @Autowired
    public EmployeeServiceImpl(EmployeeRepositoryDAO repository) {
        this.repository = repository;
    }
    @Override
    public List<Employee> findAll() {
        return repository.findAll();
    }
}
