package com.hood.spring3objectfactory.Controller;

import com.hood.spring3objectfactory.Coach.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/coach")
public class DemoController {
    @Autowired
    public void setNewCoach(@Qualifier("baseballcoach") Coach newCoach) {
        System.out.println("in constructor: " + getClass().getSimpleName());
        this.newCoach = newCoach;
    }

    Coach  newCoach;

    @GetMapping("/new")
    String getNewCoach() {
        newCoach.setName("robin hood");
        return newCoach.getDailyWorkout();
    }
}
