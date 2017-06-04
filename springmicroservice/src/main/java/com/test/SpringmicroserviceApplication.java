package com.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication
public class SpringmicroserviceApplication extends SpringBootServletInitializer  {

	@Override
	protected SpringApplicationBuilder configure(
			SpringApplicationBuilder builder) {
		// TODO Auto-generated method stub
		return builder.sources(SpringmicroserviceApplication.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringmicroserviceApplication.class, args);
	}
	
	
}
