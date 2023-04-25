package com.example.demo1;


import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class Jum {
	
	
	@GetMapping("/hi")
	public String display()
	{
		return "hi";
	}

}
