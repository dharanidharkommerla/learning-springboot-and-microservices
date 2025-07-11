package com.nareshit.helloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
// by --> default @ComponentScan("com.nareshit.helloworld")
// modifying to --> @ComponentScan("com.nareshit.*")

@ComponentScan("com.nareshit.*")
public class HelloWorldUsingStsPluginApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloWorldUsingStsPluginApplication.class, args);
	}

}
