package com.spring.ex;

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
	@RequestMapping("/Talent/Profile_writer")
	public String Talent_Profile_writer() {
		return "/Talent/Profile_writer";
	}
	@RequestMapping("/PageSet")
	public String PageSet() {
		return "/PageSet";
	}
	@RequestMapping("/Talent/Profile_management")
	public String Talent_Profile_management() {
		return "/Talent/Profile_management";
	}
	@RequestMapping("/Talent/Talent_scrap")
	public String Talent_Talent_scrap() {
		return "/Talent/Talent_scrap";
	}
	@RequestMapping("/Talent/Human_resource_info")
	public String Talent_Human_resource_info() {
		return "/Talent/Human_resource_info";
	}
	@RequestMapping("/Talent/Support_status")
	public String Talent_Support_status() {
		return "/Talent/Support_status";
	}
	@RequestMapping("/Talent/Human_resource_look")
	public String Talent_Human_resource_look() {
		return "/Talent/Human_resource_look";
	}
	
}
