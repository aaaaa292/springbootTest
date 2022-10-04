package com.jobtest.springbootTest.model.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {

	@GetMapping("/pagination")
	public String TestJob(){
		return "test";
	}
	
	
}
