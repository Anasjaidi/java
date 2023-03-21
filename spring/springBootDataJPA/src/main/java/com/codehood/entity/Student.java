package com.codehood.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Student {
    @Id
    private Long id;
    private String firstName;
    private String lastName;

    private Integer age;
    private String email;
}
