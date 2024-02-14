package com.kh.carrot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {


	@RequestMapping("/hello")
	public String hello() {
		return "Hello Git!       !!";
	}
	

//	@RequestMapping("/yelimlee")
//	public String yelimlee() {
//		return "Hello Git!";
//	} 


//	@RequestMapping("/cat")
//	public String cat() {
//		return "Hello Git!!";
//	}
//	@RequestMapping("/yelimlee")
//	public String yelimlee() {
//		return "Hello Git!";
//	} 

}
