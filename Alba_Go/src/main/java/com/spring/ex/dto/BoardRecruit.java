package com.spring.ex.dto;

public class BoardRecruit {
	int boardRecruit_id;//인재글 id;
	String title;// 제목
	String memo;// 메모
	String date;// 작성날짜
	String individual_id;//개인회원 id
	int resume_id;//이력서id
	
	public int getBoardRecruit_id() {
		return boardRecruit_id;
	}
	public void setBoardRecruit_id(int boardRecruit_id) {
		this.boardRecruit_id = boardRecruit_id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getMemo() {
		return memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getIndividual_id() {
		return individual_id;
	}
	public void setIndividual_id(String individual_id) {
		this.individual_id = individual_id;
	}
	public int getResume_id() {
		return resume_id;
	}
	public void setResume_id(int resume_id) {
		this.resume_id = resume_id;
	}
	
	
}
