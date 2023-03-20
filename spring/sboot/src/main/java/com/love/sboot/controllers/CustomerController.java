package com.love.sboot.controllers;

import com.love.sboot.models.Customer;
import com.love.sboot.repository.CustomerRepository;
import lombok.Data;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/customers")
@Data
public class CustomerController {
    private final CustomerRepository customerRepository;
    @GetMapping
    public List<Customer> getCustomers() {
        return customerRepository.findAll();
    }

}
