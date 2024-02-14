package com.kh.carrot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Team4Controller {
	@RequestMapping("/cat")
	public String cat() {
		return "Hello Cat!!";
	}
}
