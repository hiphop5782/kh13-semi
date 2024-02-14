package com.kh.carrot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@RequestMapping("/kh")
	public String kh() {
		return "Hello Git!";
	}

	// 돼라
	@RequestMapping("/zeze")
	public String zeze() {
		return "Hello Git  !";
	}

	@RequestMapping("/hello")
	public String hello() {
		return "Hello Git!  !!! !!";
	}

	@RequestMapping("/lee")
	public String lee() {
		return "Hello Git!";
	}

	@RequestMapping("/yeah2")
	public String yeah2() {
		return "Hello Git!";
	}
	@RequestMapping("/cat")
	public String cat() {
		return "Hello Git!";
	}
}
