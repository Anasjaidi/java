package com.robin.sprinrestapi.modules.employees.dto;

import jakarta.persistence.Column;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;

public class EmployeeRequest {
    @NotNull
    private String firstName;
    @NotNull
    private String lastName;
    @Email
    private String email;
}
