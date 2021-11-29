package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class zello {
	@RequestMapping("/hell")
	public String hello()
	{
		return ("Hello World");  
		
	}

}

