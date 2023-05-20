package com.robin.sprinrestapi.modules.employees.repository;

import com.robin.sprinrestapi.modules.employees.entity.Employee;

import java.util.List;

public interface EmployeeRepositoryDAO {

    List<Employee> findAll();
}
