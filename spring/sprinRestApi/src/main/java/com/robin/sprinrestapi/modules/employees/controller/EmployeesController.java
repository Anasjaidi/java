package com.robin.sprinrestapi.modules.employees.controller;

import com.robin.sprinrestapi.modules.employees.dto.AddNewEmployeeRequest;
import com.robin.sprinrestapi.modules.employees.dto.UpdateEmployeeRequest;
import com.robin.sprinrestapi.modules.employees.entity.Employee;
import com.robin.sprinrestapi.modules.employees.service.EmployeesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/employees")
public class EmployeesController {
    EmployeesService service;
    @Autowired
    public EmployeesController(EmployeesService service) {
        this.service = service;
    }
    @GetMapping
    public List<Employee> getAllEmployees() {
        return service.findAll();
    }

    @GetMapping("{id}")
    public Employee getEmployeeById(@PathVariable int id) {
        return service.findById(id);
    }

    @PostMapping
    public ResponseEntity<Employee> saveNewEmployee(@RequestBody AddNewEmployeeRequest addNewEmployeeRequest) {
        Employee newEmployee = Employee.builder(0, addNewEmployeeRequest.getFirstName(), addNewEmployeeRequest.getLastName(), addNewEmployeeRequest.getEmail());

        return new ResponseEntity<>(service.save(newEmployee), HttpStatus.CREATED);
    }


    @PatchMapping("{id}")
    public Employee updateEmployee(@RequestBody UpdateEmployeeRequest update, @PathVariable int id) {

        Employee employee = Employee.builder(id, update.getFirstName(), update.getLastName(), update.getEmail()) ;

        return service.save(employee);
    }

    @DeleteMapping("{id}")
    public void deleteEmployee(@PathVariable int id) {
        service.deleteById(id);
    }
}
