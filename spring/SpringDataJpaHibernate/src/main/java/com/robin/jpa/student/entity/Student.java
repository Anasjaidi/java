package com.robin.jpa.student.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity(name = "Student")
@Table(name = "students", uniqueConstraints = {
        @UniqueConstraint(name = "student_email_unique", columnNames = "email")
})
@Data
@AllArgsConstructor(staticName = "builder")
@NoArgsConstructor
public class Student {
    @Id
    @SequenceGenerator(name = "student_seq", sequenceName = "student_sq_name", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "student_sq_name")
    private Long id;

    @Column(name = "first_name", nullable = false, columnDefinition = "TEXT")
    private String firstName;

    @Column(name = "last_name", nullable = false, columnDefinition = "TEXT")
    private String lastName;

    @Column(name = "email", nullable = false, columnDefinition = "TEXT")
    private String email;

    @Column(name = "age", nullable = false)

    private Integer age;
}
