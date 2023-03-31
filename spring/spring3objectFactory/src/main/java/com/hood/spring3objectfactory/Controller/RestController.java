package com.hood.spring3objectfactory.Controller;

import com.hood.utils.Coach.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

@org.springframework.web.bind.annotation.RestController
public class RestController {
    @Autowired
    public RestController(Coach myCoach) {
        this.myCoach = myCoach;
    }

    Coach myCoach;


    @GetMapping ("/coach")
    @ResponseStatus(code = HttpStatus.BAD_REQUEST)
    public String get() {
        return myCoach.getDailyWorkout();
    }
}