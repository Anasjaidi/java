package com.hood.spring3objectfactory.Coach.CricketCoach;

import com.hood.spring3objectfactory.Coach.Coach;
import org.springframework.stereotype.Component;

@Component



public class CricketCoach implements Coach {
    @Override
    public String getDailyWorkout() {
        return "ok its good body";
    }
}
