package com.kh.carrot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Team2Controller {
	
	@RequestMapping("/zlzlzl")
	public String zlzlzl() { 
		return "hi baby";
	}

}
