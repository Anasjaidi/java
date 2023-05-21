package com.robin.springsecurity.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class BasicSecurityConfig {
    @Bean
    public InMemoryUserDetailsManager BasicSecurityConfig() {

        UserDetails robin =  User.builder().username("robin").password("{noop}robin").roles(
                "admin"
        ).build();

        UserDetails anas =  User.builder().username("anas").password("{noop}anas").roles(
                "manager"
        ).build();

        UserDetails jaidi =  User.builder().username("jaidi").password("{noop}jaidi").roles(
                "EMPLOYEE"
        ).build();

        return new InMemoryUserDetailsManager(robin, anas, jaidi);
    }

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {

        http.authorizeHttpRequests(req -> {
            req
                    .requestMatchers(HttpMethod.GET, "/api/v1/employees/**").hasAnyRole("EMPLOYEE", "admin")
                    .requestMatchers(HttpMethod.GET, "/api/v1/employees").hasAnyRole("EMPLOYEE", "admin")
                    .requestMatchers(HttpMethod.PATCH, "/api/v1/employees/**").hasAnyRole("manager", "admin")
                    .requestMatchers(HttpMethod.POST, "/api/v1/employees").hasAnyRole("manager", "admin")
                    .requestMatchers(HttpMethod.DELETE, "/api/v1/employees/**").hasAnyRole("admin");
        });
        http.httpBasic();

        http.csrf().disable();
        return http.build();
    }
}
