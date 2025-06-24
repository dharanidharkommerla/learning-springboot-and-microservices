package com.nareshit.helloworld;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldContoller {
	
	@RequestMapping(value="/")
	public String getHelloWorld() {
		return "<h1>HelloWorld from Springboot project created by STS Pluging</h1>";
	}
}
