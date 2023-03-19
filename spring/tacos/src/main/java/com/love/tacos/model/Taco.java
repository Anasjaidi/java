package com.love.tacos.model;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

//import javax.validation.constraints.Size;
import java.util.List;

@Data
public class Taco {

    @Size(min = 1, message = "add at least one ingredient")
    private List<String> ingredients;
//    @Size
    @NotNull
    @Size(min = 5, message = "please write at least 5 chars")
    private String name;

}
