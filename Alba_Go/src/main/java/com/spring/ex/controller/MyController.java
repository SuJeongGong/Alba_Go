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
	@RequestMapping("/sidebar")
	public String sidebar() {
		return "/sidebar";
	}
	@RequestMapping("/Account_enterprise")
	public String Account_enterprise() {
		return "/Account_enterprise";
	}
	@RequestMapping("/Talent/Human_resource_info")
	public String Talent_Human_resource_info() {
		return "/Talent/Human_resource_info";
	}
	@RequestMapping("/Talent/Human_resource_look")
	public String Talent_Human_resource_look() {
		return "/Talent/Human_resource_look";
	}
	@RequestMapping("/Talent/Profile_management")
	public String Talent_Profile_management() {
		return "/Talent/Profile_management";
	}
	@RequestMapping("/Talent/Profile_writer")
	public String Talent_Profile_writer() {
		return "/Talent/Profile_writer";
	}
	@RequestMapping("/Talent/Support_status")
	public String Talent_Support_status() {
		return "/Talent/Support_status";
	}
	@RequestMapping("/Talent/Talent_scrap")
	public String Talent_Talent_scrap() {
		return "/Talent/Talent_scrap";
	}
	@RequestMapping("/sign_up")
	public String sign_up() {
		return "/sign_up";
	}
	@RequestMapping("/find_id")
	public String find_id() {
		return "/find_id";
	}
	@RequestMapping("/find_pw")
	public String find_pw() {
		return "/find_pw";
	}
	@RequestMapping("/manager/manager_enterprise_search")
	public String manager_manager_enterprise_search() {
		return "/manager/manager_enterprise_search";
	}
	@RequestMapping("/manager/manager_individual_search")
	public String manager_manager_individual_search() {
		return "/manager/manager_individual_search";
	}
	@RequestMapping("/manager/manager_main")
	public String manager_manager_main() {
		return "/manager/manager_main";
	}
	@RequestMapping("/manager/manager_product_management")
	public String manager_manager_product_management() {
		return "/manager/manager_product_management";
	}
	
}
