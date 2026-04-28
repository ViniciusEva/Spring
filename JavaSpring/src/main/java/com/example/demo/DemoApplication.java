// https://start.spring.io/ 
// add dependencies: Spring Web

package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	// Pesquisar na URL: http://localhost:8080/hello
	@GetMapping("/hello")
	public String hello() {
		return "Hello, World!";
	}

}
