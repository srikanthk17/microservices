package com.test;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MicroController {
	
	@RequestMapping("/hi")
	public String hiThere() {
		return "hello world";
	}

}
