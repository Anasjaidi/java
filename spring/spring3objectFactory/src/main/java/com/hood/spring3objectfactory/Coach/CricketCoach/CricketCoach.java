package com.hood.spring3objectfactory.Coach.CricketCoach;

import com.hood.spring3objectfactory.Coach.Coach;
import org.springframework.stereotype.Component;

@Component



public class CricketCoach implements Coach {
    public void setName(String name) {
        this.name = name;
    }

    String name = "anas jaidi";
    @Override
    public String getDailyWorkout() {
        return "ok its good body " + name;
    }
}
