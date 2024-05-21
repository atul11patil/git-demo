package com.example.aws.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBooAwsExampleApplication {

	@GetMapping("/status")
	public String deploy(){
	return "Application is deploy on AWS beanstalk";

	}

	public static void main(String[] args) {
		SpringApplication.run(SpringBooAwsExampleApplication.class, args);
	}

}
