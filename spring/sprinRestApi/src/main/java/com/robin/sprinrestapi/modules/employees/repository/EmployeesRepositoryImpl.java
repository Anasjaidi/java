package com.robin.sprinrestapi.modules.employees.repository;

import com.robin.sprinrestapi.modules.employees.entity.Employee;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmployeesRepositoryImpl implements EmployeesRepository {
    private EntityManager manager;
    @Autowired
    public EmployeesRepositoryImpl(EntityManager manager) {
        this.manager = manager;
    }
    @Override
    public List<Employee> findAll() {
        TypedQuery<Employee> query = manager.createQuery("from Employee", Employee.class);
        return query.getResultList();
    }

    @Override
    public Employee findById(int id) {
        return manager.find(Employee.class, id);
    }

    @Override
    public Employee save(Employee employee) {
        return manager.merge(employee);
    }

    @Override
    public void deleteById(int id) {
        Employee employee = this.findById(id);

        manager.remove(employee);
    }
}
