package com.hood.spring3objectfactory.Coach.BaseballCoach;

import com.hood.spring3objectfactory.Coach.Coach;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class Baseballcoach implements Coach {
    public Baseballcoach() {
        System.out.println("in constructor: " + getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkout() {
        return "base ball coach";
    }
    String name;
    @Override
    public void setName(String name) {
        name = name;
    }
}
