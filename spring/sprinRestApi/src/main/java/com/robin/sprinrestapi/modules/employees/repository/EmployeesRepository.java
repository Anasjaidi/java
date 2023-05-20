package com.robin.sprinrestapi.modules.employees.repository;

import com.robin.sprinrestapi.modules.employees.entity.Employee;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmployeesRepository implements EmployeeRepositoryDAO{
    private EntityManager manager;
    @Autowired
    public EmployeesRepository(EntityManager manager) {
        this.manager = manager;
    }
    @Override
    public List<Employee> findAll() {
        TypedQuery<Employee> query = manager.createQuery("from Employee", Employee.class);
        return query.getResultList();
    }
}
