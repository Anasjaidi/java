package com.hood.spring3objectfactory.Coach.CricketCoach;

import com.hood.spring3objectfactory.Coach.Coach;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Primary
@Lazy
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class CricketCoach implements Coach {
    public CricketCoach() {
        System.out.println("in constructor: " + getClass().getSimpleName());
    }
    public void setName(String name) {
        this.name = name;
    }

    String name = "anas jaidi";
    @Override
    public String getDailyWorkout() {
        return "ok its good body " + name;
    }
}
