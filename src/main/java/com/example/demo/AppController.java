package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {
	
	
	@GetMapping("home")
	public String getHome() {
		
		return "hello from pipeline";
		
	}
	
	
	
	@GetMapping("admin")
	public String getAdmin() {
		
		return "hello from admin";
		
	}
	
	
	

}