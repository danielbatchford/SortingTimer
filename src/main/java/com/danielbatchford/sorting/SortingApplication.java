package com.danielbatchford.sorting;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class SortingApplication {

	public static void main(String[] args) {

		SpringApplication.run(SortingApplication.class, args);
	}

	@GetMapping("/hello")
	public String hello(@RequestParam(value = "name") String name) {
		return String.format("Hello %s!", name);
	}

}