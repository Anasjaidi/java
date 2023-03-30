package com.hood.spring3objectfactory.CricketCoach;

import com.hood.spring3objectfactory.Coach.Coach;

public class CricketCoach implements Coach {
    @Override
    public String getDailyWorkout() {
        return "ok its god";
    }
}
