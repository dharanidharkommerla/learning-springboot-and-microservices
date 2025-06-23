package com.nareshit.helloworld;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	
	@RequestMapping(value="/")
	public String getHelloWorld() {
		return "Welcome to SpringBoot";
	}
}

// assume that,

// creating obj for the above class
// HelloWorldController obj = new HelloWorldController(); --> it is done by @RestController 

// calling the method
// obj.getHelloWorld(); --> @RequestMapping(value="/");