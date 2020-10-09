package com.example.webservices.restfulwebservices.helloworld;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
@RestController
@CrossOrigin(origins = "http://localhost:4200")

public class HelloWorldController {
	@GetMapping(path = "/hello-world")
	public String helloWolrd() {
		return "Hmd";
	}
	@GetMapping(path="/hello-bean/")
	public HelloBean helloBean() {
		//throw new RuntimeException("Some error has happened !!!!!");
		return new HelloBean("hello bean - changed");
	}
	@GetMapping(path="/hello-bean/pathVariable/{name}")
	public HelloBean helloBeanPath(@PathVariable String name) {
		//throw new RuntimeException("Some error has happened !!!!!");
		return new HelloBean(String.format("hello bean, %s", name));
	}
}