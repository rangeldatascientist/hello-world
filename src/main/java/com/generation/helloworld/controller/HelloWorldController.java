package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello-world")
public class HelloWorldController {

	
	@GetMapping
	public String helloWorld () {
		return "Hello World!!!";
	}
	
	@GetMapping("/bsm")
	public String bsm () {
		return "Persistência";
	}
	@GetMapping("/lista")
	public String lista () {
		return "Bloco BackEnd: banco de dados, spring";
	}
}


