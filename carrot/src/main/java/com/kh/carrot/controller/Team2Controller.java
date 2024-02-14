package com.kh.carrot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Team2Controller {

	@RequestMapping("/team2Zzzang")
	public String team22() {
		return "team2Zzzang";
	}

	@RequestMapping("/team2")
	public String team2() {
		return "형우야 잘하자";

	}
}
