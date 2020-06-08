package com.spring.ex.dto;

public class BoardAnnounce {
	int boardAnnounce_id;//공고글 id;
	String title;// 제목
	String memo;// 메모
	String date;// 작성날짜
	String enterprise_id;//기업회원 id
	int announce_id;//공고id
	
	public int getBoardAnnounce_id() {
		return boardAnnounce_id;
	}
	public void setBoardAnnounce_id(int boardAnnounce_id) {
		this.boardAnnounce_id = boardAnnounce_id;
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
	public String getEnterprise_id() {
		return enterprise_id;
	}
	public void setEnterprise_id(String enterprise_id) {
		this.enterprise_id = enterprise_id;
	}
	public int getAnnounce_id() {
		return announce_id;
	}
	public void setAnnounce_id(int announce_id) {
		this.announce_id = announce_id;
	}
	
	
}
