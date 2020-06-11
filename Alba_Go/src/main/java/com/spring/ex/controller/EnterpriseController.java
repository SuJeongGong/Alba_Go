package com.spring.ex.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EnterpriseController {
	@RequestMapping("/main")
	public String main() {
		return "/main";
	}
}
