package com.kh.carrot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	
	@RequestMapping("/yeah2")
	public String yeah2() {
		return "Hello Git!";
	}
	@RequestMapping("/yeah3")
	public String yeah3() {
		return "Hello Git!";
	}
}
