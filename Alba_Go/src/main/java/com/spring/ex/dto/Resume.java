package com.spring.ex.dto;

import java.util.ArrayList;

import lombok.Data;

@Data
public class Resume {
	String individual_id;//개인회원 id
	int resume_id;//이력서 id
	String place;//희망근무지
	String category;//희망 업종
	String salary_type;//희망 월급 종류
	int salary_amount;//희망 월급 금액
	String term;//희망 기간
	ArrayList<Career> career;//경력사항
	
	
	
}
