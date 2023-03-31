package com.hood.spring3objectfactory.Coach.SwimCoach;

import com.hood.spring3objectfactory.Coach.Coach;

public class SwimCoach implements Coach {
    @Override
    public String getDailyWorkout() {
        return "swimming";
    }
    String name;

    @Override
    public void setName(String name) {
    name = name;
    }
}
