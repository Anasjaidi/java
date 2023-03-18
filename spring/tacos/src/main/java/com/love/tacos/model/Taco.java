package com.love.tacos.model;

import lombok.Data;

import java.util.List;

@Data
public class Taco {
    private List<String> ingredients;
    private String name;
}
