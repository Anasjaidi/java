package com.robin.springsecurity.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
public class BasicSecurityConfig {
    @Bean
    public InMemoryUserDetailsManager BasicSecurityConfig() {

        UserDetails robin =  User.builder().username("robin").password("{noop}robin").roles(
                "admin"
        ).build();

        return new InMemoryUserDetailsManager(robin);
    }
}
