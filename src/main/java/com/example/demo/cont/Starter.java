package com.example.demo.cont;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Starter {
	@GetMapping
	public String get() {
		return "called";
	}

}
