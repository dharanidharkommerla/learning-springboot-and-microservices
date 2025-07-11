package com.nareshit.helloworld;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/insurance")
public class InsuranceController {
	// health insurance
	@RequestMapping(value="/health")
	public String getHealthInsurance() {
		return "<h2>Reached to Health Insurance Section</h2>";
	}
	
	@RequestMapping(value="/term")
	public String getTermInsurance() {
		return "<h2>Reached to Term Insurance Section</h2>";
	}
}
