package com.hood.utils.Coach.CricketCoach;

import com.hood.utils.Coach.Coach;
import org.springframework.stereotype.Component;

@Component



public class CricketCoach implements Coach {
    @Override
    public String getDailyWorkout() {
        return "ok its good body";
    }
}
