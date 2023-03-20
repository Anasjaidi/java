package com.love.tacos.controller;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

//@Controller
@Configuration
public class TacoHomeController implements WebMvcConfigurer {

//	@GetMapping("/")
//	public String  getHoume() {
//		return "home";
//	}
	@Override
	public void  addViewControllers(ViewControllerRegistry registry) {
		registry.addViewController("/").setViewName("home");
	}


}
