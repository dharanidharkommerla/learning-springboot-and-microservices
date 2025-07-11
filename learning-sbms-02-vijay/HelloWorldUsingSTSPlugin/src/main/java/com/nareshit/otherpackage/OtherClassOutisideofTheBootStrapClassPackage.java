package com.nareshit.otherpackage;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/other")
public class OtherClassOutisideofTheBootStrapClassPackage {
	@RequestMapping(value="/info")
	public String getInfo() {
		return "<h2>This is class is outside of the bootstrap class package</h2>";
	}
}
