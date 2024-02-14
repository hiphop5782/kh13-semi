package com.kh.carrot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Team3Controller {

	@RequestMapping("/soyeon")
	public String home() {
		return "Hello!";

	}
}
