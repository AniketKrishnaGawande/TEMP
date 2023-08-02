package com.example.demo.cont;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class temp {

	@GetMapping
	public String get() {
		return "hello";
	}

}
