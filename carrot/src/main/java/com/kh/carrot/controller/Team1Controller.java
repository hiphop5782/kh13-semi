package com.kh.carrot.controller;

import org.springframework.web.bind.annotation.RequestMapping;

public class Team1Controller {

	@RequestMapping("/chch")
	public String chch() {
		return "Hello Git!";
	}
}
