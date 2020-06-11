package com.spring.ex.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("*.do")
public class MainController {
	@RequestMapping("/")
	public String main() {
		return "/main";
	}
	@RequestMapping("/test")
	public String test() {
		return "/test";
	}
	
}
