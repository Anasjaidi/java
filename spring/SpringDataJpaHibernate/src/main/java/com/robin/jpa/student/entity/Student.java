package com.robin.jpa.student.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity(name = "Student")
@Table(name = "students")
@Data
@AllArgsConstructor(staticName = "builder")
@NoArgsConstructor
public class Student {
    @Id
    @SequenceGenerator(name = "student_seq", sequenceName = "student_sq_name", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "student_sq_name")
    private Long id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "email")
    private String email;

    @Column(name = "age")

    private Integer age;
}
