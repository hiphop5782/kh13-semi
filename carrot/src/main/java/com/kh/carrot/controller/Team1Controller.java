package com.kh.carrot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Team1Controller {

	@RequestMapping("/team1")
	public String team1() {
		return "Hello team1";
	}
}
