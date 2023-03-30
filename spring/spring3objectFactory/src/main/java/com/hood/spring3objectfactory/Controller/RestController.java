package com.hood.spring3objectfactory.Controller;

import com.hood.spring3objectfactory.Coach.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.web.bind.annotation.RestController
public class RestController {
    @Autowired
    public RestController(Coach myCoach) {
        this.myCoach = myCoach;
    }

    Coach myCoach;



    @GetMapping ("/coach")
    public String get() {
        return myCoach.getDailyWorkout();
    }
}
