package com.hood.spring3objectfactory.Coach.BaseballCoach;

import com.hood.spring3objectfactory.Coach.Coach;
import org.springframework.stereotype.Component;

@Component
public class Baseballcoach implements Coach {
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
