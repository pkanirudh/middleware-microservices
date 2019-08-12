package com.example.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CallDriverController {
	
	@GetMapping("/drivers")
	public String getDriver() {
		return "Frank Martin - 329648236";
	}

}
