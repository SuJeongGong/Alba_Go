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
	@RequestMapping("/Profile_writer")
	public String Profile_writer() {
		return "/Profile_writer";
	}
	@RequestMapping("/PageSet")
	public String PageSet() {
		return "/PageSet";
	}
	@RequestMapping("/Profile_management")
	public String Profile_management() {
		return "/Profile_management";
	}
	@RequestMapping("/Talent_infomation")
	public String Talent_infomation() {
		return "/Talent_infomation";
	}
	
}
