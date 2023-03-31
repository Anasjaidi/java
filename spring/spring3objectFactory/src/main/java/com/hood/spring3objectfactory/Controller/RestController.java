package com.hood.spring3objectfactory.Controller;

import com.hood.spring3objectfactory.Coach.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

@org.springframework.web.bind.annotation.RestController
public class RestController {
    @Autowired
    public RestController(@Qualifier("cricketCoach") Coach myCoach, @Qualifier("swimCoach") Coach swim) {
        System.out.println("in constructor: " + getClass().getSimpleName());
        this.myCoach = myCoach;
        this.swimCoach = swim;
    }

    Coach myCoach;
    Coach swimCoach;


    @GetMapping ("/coach")
    @ResponseStatus(code = HttpStatus.BAD_REQUEST)
    public String get() {
        return myCoach.getDailyWorkout() + swimCoach.getDailyWorkout();
    }
}