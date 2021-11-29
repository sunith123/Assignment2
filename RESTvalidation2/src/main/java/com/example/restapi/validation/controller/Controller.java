package com.example.restapi.validation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.restapi.validation.service.AuthenticationServiceImpl;

@RestController
public class Controller {
	
	@Autowired
	AuthenticationServiceImpl service;
	
	@GetMapping("/valid")
	@ResponseBody
	public String auth(@RequestParam String uname , @RequestParam String pass) {
		
		return service.isValid(uname, pass);
	}
	

	
	
	
	

}
