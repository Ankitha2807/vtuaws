package com.example.demo;

import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.bind.annotation.GetMapping;

@RestController

public class Sample 

{
	
@GetMapping("/display")
	public String display() 
	{
		return "welcome to my first spring boot aws application";
	}

}

