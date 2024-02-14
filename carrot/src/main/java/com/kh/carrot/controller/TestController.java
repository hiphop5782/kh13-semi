package com.kh.carrot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	

	@RequestMapping("/zeze")
	public String zeze() { 
		return "Hello Git  !";
	}


	@RequestMapping("/hello")
	public String hello() {
		return "Hello Git!  !!! !!";
	}

	
	@RequestMapping("/yeah2")
	public String yeah2() {
		return "Hello Git!";
	}
}
