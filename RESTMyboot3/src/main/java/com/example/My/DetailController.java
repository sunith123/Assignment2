package com.example.My;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DetailController {
	@Autowired
	private DetailService detailService;
	
	@RequestMapping("/details")
	public List<Details> getAllDetails() {
		return detailService.getAllDetails();
	}
	@RequestMapping("/details/{id}")
	public Details getDetails(@PathVariable Long id) {
		return detailService.getDetails(id);
		
	}
	
}

	


