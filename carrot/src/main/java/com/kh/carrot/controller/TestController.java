package com.kh.carrot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	//돼라
	//로또 1뜽

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

		return "Hello Git!  ";


	}



}
