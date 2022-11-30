package com.knf.dev.dem;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

	@GetMapping("/")
	public String hello() {
		return "Hello World! Welcome to your springboot application....";
	}

}
