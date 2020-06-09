package com.spring.ex.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {
	@RequestMapping("/main")
	public String main() {
		return "/main";
	}
	@RequestMapping("/test")
	public String test() {
		return "/test";
	}
	
	@RequestMapping("/Mypage_Individual")
	public String Mypage_Individual() {
		return "/Mypage_Individual";
	}
	
	@RequestMapping("/Mypage_enterprise")
	public String Mypage_enterprise() {
		return "/Mypage_enterprise";
	}
	@RequestMapping("/Account_Individual")
	public String Account_Individual() {
		return "/Account_Individual";
	}
	@RequestMapping("/Account_enterprise")
	public String Account_enterprise() {
		return "/Account_enterprise";
	}
	@RequestMapping("manager/manager_sidebar")
	public String manager_manager_sidebar() {
		return "manager/manager_sidebar";
	}
	@RequestMapping("Talent/Talent_scrap")
	public String Talent_Talent_scrap() {
		return "Talent/Talent_scrap";
	}
	
}
