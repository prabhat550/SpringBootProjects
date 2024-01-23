package com.springsecurity.JWT_Authentication.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class APILayer {

	@GetMapping(value = "/hello")
	public String helloWord() {
		return "Hello World";
	}
	
}
