package com.robin.springsecurity.modules.employees.service;

import com.robin.springsecurity.modules.employees.entity.Employee;
import com.robin.springsecurity.modules.employees.repository.EmployeesRepository;
import jakarta.transaction.Transactional;
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

    @Override
    public Employee findById(int id) {
        return repository.findById(id);
    }
    @Override
    @Transactional
    public Employee save(Employee employee) {
        return repository.save(employee);
    }

    @Override
    @Transactional
    public void deleteById(int id) {
        repository.deleteById(id);
    }
}
