package com.kh.carrot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	


	@RequestMapping("/soyeon")
	public String hello() {
		return "Hello Git!";
	}

	



	


}
