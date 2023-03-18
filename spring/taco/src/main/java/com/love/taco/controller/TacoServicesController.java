package com.love.taco.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TacoServicesController {
	
	@GetMapping("services")
	public String getRootService() {
		
		return "services";
	}
}
