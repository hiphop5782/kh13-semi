package com.kh.carrot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	

	@RequestMapping("/git")
	public String git() {
		return "/WEB-INF/views/git.jsp";
	}

@RequestMapping("/yelimlee")
	public String yelimlee() {
		return "Hello Git!";
		//될까요
	} 

}
