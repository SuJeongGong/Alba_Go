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
	@RequestMapping("/Talent/Human_resource_info")
	public String Human_resource_info() {
		return "/Talent/Human_resource_info";
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
	@RequestMapping("/Review_content")
	public String Review_content() {
		return "/Review_content";
	}
	@RequestMapping("/Review_list")
	public String Review_list() {
		return "/Review_list";
	}
	@RequestMapping("/Review_write")
	public String Review_write() {
		return "/Review_write";
	}
	@RequestMapping("/Manager_human_info")
	public String Manager_human_info() {
		return "/Manager_human_info";
	}
	@RequestMapping("/Manager_reviewlist")
	public String Manager_reviewlist() {
		return "/Manager_reviewlist";
	}
	@RequestMapping("/Manager_payment")
	public String Manager_payment() {
		return "/Manager_payment";
	}
	@RequestMapping("/Product_list")
	public String Product_list() {
		return "/Product_list";
	}
	@RequestMapping("/Payment")
	public String Payment() {
		return "/Payment";
	}
	
}
