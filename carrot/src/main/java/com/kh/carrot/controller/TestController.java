package com.kh.carrot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {


	@RequestMapping("/coffee")
	public String coffee() {
		return "Hello Git!";
	}//ㅁㄴㅇㅁㄴㅇ

	
	@RequestMapping("/yelimlee")
	public String yelimlee() {
		return "Hello Git!";   
	} 

}
