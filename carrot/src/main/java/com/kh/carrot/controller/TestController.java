package com.kh.carrot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@RequestMapping("/kwonseozero")
	public String kwonseozero() {
		return "Hello Git!";
	}
	
	
}
