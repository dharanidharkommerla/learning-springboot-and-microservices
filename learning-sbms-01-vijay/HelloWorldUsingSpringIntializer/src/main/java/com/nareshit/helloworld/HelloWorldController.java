package com.nareshit.helloworld;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	@RequestMapping(value="/")
	public String getHelloWorld() {
		return "Hello World, from spring boot application using Spring Intaializr";
	}
}
