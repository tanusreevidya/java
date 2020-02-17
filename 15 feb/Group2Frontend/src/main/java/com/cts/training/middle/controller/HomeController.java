package com.cts.training.middle.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	
	@GetMapping(value= {"/","/home"})
	public String HomePage()
	{
		return "index";
	}
	
	@GetMapping(value="/admin")
	public String adminPage() {
		return "admin";
	}
	
	@GetMapping(value="/product-view")
	public String productPage() {
		return "Product";
	}

}
