package com.kh.carrot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	//돼라


	@RequestMapping("/soyeon")
	public String soyeon() {
		return "Hello Git!";
	}

	
}
