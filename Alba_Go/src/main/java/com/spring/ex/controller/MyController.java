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
	
	@RequestMapping("/Mypage_Individual")//개인회원 정보 마이페이지
	public String Mypage_Individual() {
		return "/Mypage_Individual";
	}
	@RequestMapping("/Talent/Human_resource_info")//전체인재정보
	public String Human_resource_info() {
		return "/Talent/Human_resource_info";
	}
	@RequestMapping("/Talent/Human_resource_look")//인재 글보기
	public String Human_resource_look() {
		return "/Talent/Human_resource_look";
	}
	@RequestMapping("/Talent/Profile_management")//이력서 관리
	public String Profile_management() {
		return "/Talent/Profile_management";
	}
	@RequestMapping("/Talent/Talent_scrap")//스크랩 알바
	public String Talent_scrap() {
		return "/Talent/Talent_scrap";
	}
	@RequestMapping("/Talent/Profile_writer")//이력서 작성
	public String Profile_writer() {
		return "/Talent/Profile_writer";
	}
	@RequestMapping("/Talent/Support_status")//지원 현황
	public String Support_status() {
		return "/Talent/Support_status";
	}
	@RequestMapping("/Mypage_enterprise")//기업회원 정보
	public String Mypage_enterprise() {
		return "/Mypage_enterprise";
	}
	@RequestMapping("/Account_Individual")//개인회원 정보
	public String Account_Individual() {
		return "/Account_Individual";
	}
	@RequestMapping("/Account_enterprise")//기업회원 정보
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
	@RequestMapping("/Manager_Individual")
	public String Manager_Individual() {
		return "/Manager_Individual";
	}
	@RequestMapping("/Manager_enterprise")
	public String Manager_enterprise() {
		return "/Manager_enterprise";
	}
	@RequestMapping("/Manager_reviewlist")
	public String Manager_reviewlist() {
		return "/Manager_reviewlist";
	}
	@RequestMapping("/Manager_Account_enterprise_list")
	public String Manager_Account_enterprise_list() {
		return "/Manager_Account_enterprise_list";
	}
	@RequestMapping("/Manager_Account_Individual_list")
	public String Manager_Account_Individual_list() {
		return "/Manager_Account_Individual_list";
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
