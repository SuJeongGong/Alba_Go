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
	@RequestMapping("/manager/manager_Sidebar")
	public String manager_manager_Sidebar() {
		return "manager/manager_Sidebar";
	}
	@RequestMapping("/Talent/Talent_scrap")
	public String Talent_Talent_scrap() {
		return "/Talent/Talent_scrap";
	}
	@RequestMapping("/Talent/Profile_writer")
	public String Talent_Profile_writer() {
		return "/Talent/Profile_writer";
	}
	@RequestMapping("/PageSet")
	public String PageSet() {
		return "/PageSet";
	}
	@RequestMapping("/NewFile")
	public String NewFile() {
		return "/NewFile";
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
