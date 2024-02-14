package com.kh.carrot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Team3Controller {

	@RequestMapping("/Team3")
		public String Team3() {
		return "Fighting";
	}
}
