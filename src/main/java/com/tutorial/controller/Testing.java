package com.tutorial.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/testing")
public class Testing {
	
	@RequestMapping("/v1")
	public String test(Model model) {
		
		return "test";
	}
	
	

}
