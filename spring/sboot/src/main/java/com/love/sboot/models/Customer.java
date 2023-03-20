package com.love.sboot.models;

import jakarta.persistence.*;
import lombok.Data;
@Entity
@Data
public class Customer {
    @Id
    @SequenceGenerator(
            name = "custom_id_sequence",
            sequenceName = "custom_id_sequence"
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "custom_id_sequence"
    )
    private Integer id;
    private String name;
    private Integer age;
    private String email;
}
