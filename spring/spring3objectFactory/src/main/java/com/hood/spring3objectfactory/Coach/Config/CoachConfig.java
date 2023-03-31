package com.hood.spring3objectfactory.Coach.Config;

import com.hood.spring3objectfactory.Coach.Coach;
import com.hood.spring3objectfactory.Coach.SwimCoach.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CoachConfig {
    @Bean
    Coach swimCoach() {
        return new SwimCoach();
    }
}
