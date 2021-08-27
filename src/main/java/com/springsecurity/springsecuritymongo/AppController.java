package com.springsecurity.springsecuritymongo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

	@GetMapping("/")
	public String Home() {
		return "Universal Home page";
	}
	
	@GetMapping("/user")
	public String User() {
		return "User Home page";
	}
	
	
	@GetMapping("/admin")
	public String Admin() {
		return "Admin Home page";
	}
	
}
