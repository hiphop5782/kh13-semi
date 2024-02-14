package com.kh.carrot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {


	//돼라

	@RequestMapping("/hello")
	public String hello() {
		return "Hello Git!  !!! !!";
	}
	@RequestMapping("/lee")
	public String lee() {
		return "Hello Git!  ";
	}	
	@RequestMapping("/yeah2")
	public String yeah2() {
		return "Hello Git!";
	}

}
