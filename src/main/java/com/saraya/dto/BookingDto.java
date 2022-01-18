package com.saraya.dto;

import java.time.LocalDate;

public class BookingDto {
	
	private int bookId;
	private String userId;
	private String coachId;	
	private LocalDate appointmentDate;
	private char slot;
	

	public BookingDto() {}

	public BookingDto(int bookId, String userId, String coachId, char slot, LocalDate appointmentDate) {
		super();
		this.bookId = bookId;
		this.userId = userId;
		this.coachId = coachId;
		this.slot = slot;
		this.appointmentDate = appointmentDate;
		
	}

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getCoachId() {
		return coachId;
	}

	public void setCoachId(String coachId) {
		this.coachId = coachId;
	}
	
	public char getSlot() {
		return slot;
	}

	public void setSlot(char slot) {
		this.slot = slot;
	}

	public LocalDate appointmentDate() {
		return appointmentDate;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.appointmentDate= appointmentDate;
	}
	
	@Override
	public String toString() {
		return "BookingDto [bookId=" + bookId + ", userId=" + userId + ", coachId=" + coachId + ", dateOfBirth="
				+ appointmentDate + ", slot=" + slot + "]";
	}
	
	
}
