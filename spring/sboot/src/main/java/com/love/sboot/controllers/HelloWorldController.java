package com.love.sboot.controllers;

import com.love.sboot.models.Data;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @GetMapping("/greet")
    public Data greeting() {
        final Data data = new Data();
        String[] todosArray = {"Buy milk", "Do laundry", "Take out the trash"};
        data.setTodos(todosArray);
        data.setAge(20);
        data.setName("kaoutar");
//        data.setData(data);
        return data;
    }
}
