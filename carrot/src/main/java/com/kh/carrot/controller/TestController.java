package com.kh.carrot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {


	@RequestMapping("/soyeon")
	public String soyeon() {
		return "Hello Git!";
	}

	
	@RequestMapping("/yelimlee")
	public String yelimlee() {
		return "Hello Git!";
	} 

}
