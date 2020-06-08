package com.spring.ex.dto;

public class Enterprise {
	String enterprise_id;//아이디
	String password;//비밀번호
	String bussiness_number;//사업자번호
	String name;//기업이름
	String manager_name;//담당자이름
	String manager_number;//담당자연락처
	String category;//기업카테고리
	String resume_count;//이력서보는 횟수
	String up_count;//up 횟수
	String date;
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getEnterprise_id() {
		return enterprise_id;
	}
	public void setEnterprise_id(String enterprise_id) {
		this.enterprise_id = enterprise_id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getBussiness_number() {
		return bussiness_number;
	}
	public void setBussiness_number(String bussiness_number) {
		this.bussiness_number = bussiness_number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getManager_name() {
		return manager_name;
	}
	public void setManager_name(String manager_name) {
		this.manager_name = manager_name;
	}
	public String getManager_number() {
		return manager_number;
	}
	public void setManager_number(String manager_number) {
		this.manager_number = manager_number;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getResume_count() {
		return resume_count;
	}
	public void setResume_count(String resume_count) {
		this.resume_count = resume_count;
	}
	public String getUp_count() {
		return up_count;
	}
	public void setUp_count(String up_count) {
		this.up_count = up_count;
	}
	
	
}
