package com.robin.exceptionshandling.User.dto;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserRequest {
    @NotNull(message = "user name must be not null")
    private String name;
    @NotNull
    private String email;
    @NotNull
    private String mobile;
    @NotNull
    private String gender;
    @NotNull
    private int age;
    @NotNull
    private String nationality;
}
