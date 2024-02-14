package com.kh.carrot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {


	@RequestMapping("/Jhome")
	public String home() {
		return "Hello Git!";
	}
	
	@RequestMapping("/shwyeah")
	public String shwyeah() {
		return "Hello Git!";
	}

	@RequestMapping("/kwonseozero")
	public String kwonseozero() {
		return "Hello Git!";
	}
	
	@RequestMapping("/yelimlee")
	public String yelimlee() {
		return "Hello Git!";
	} 
	@RequestMapping("/yelimlee2")
	public String yelimlee2() {
		return "Hello Git!";
	} 
}
