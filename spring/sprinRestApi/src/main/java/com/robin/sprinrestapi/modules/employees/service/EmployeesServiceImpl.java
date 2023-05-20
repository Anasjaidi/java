package com.robin.sprinrestapi.modules.employees.service;

import com.robin.sprinrestapi.modules.employees.entity.Employee;
import com.robin.sprinrestapi.modules.employees.repository.EmployeesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeesServiceImpl implements EmployeesService {
    private EmployeesRepository repository;
    @Autowired
    public EmployeesServiceImpl(EmployeesRepository repository) {
        this.repository = repository;
    }
    @Override
    public List<Employee> findAll() {
        return repository.findAll();
    }
}