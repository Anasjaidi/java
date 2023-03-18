package com.love.tacos.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TacoHomeController {

	@GetMapping("/")
	public String  getHoume() {
		return "home";
	}
}
