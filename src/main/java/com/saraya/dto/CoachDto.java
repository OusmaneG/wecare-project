package com.saraya.dto;

import java.time.LocalDate;

import javax.persistence.GeneratedValue;

public class CoachDto {
	
	@GeneratedValue
	private String coachId;
	private String name;
	private char gender;
	private LocalDate dateOfBirth;
	private String password;
	private Long mobileNumber;
	private String speciality;
	
	public CoachDto() {}

	public CoachDto(String name, char gender, LocalDate dateOfBirth, String password, Long mobileNumber,
			String speciality) {
		super();
		this.name = name;
		this.gender = gender;
		this.dateOfBirth = dateOfBirth;
		this.password = password;
		this.mobileNumber = mobileNumber;
		this.speciality = speciality;
	}

	public String getCoachId() {
		return coachId;
	}

	public void setCoachId(String coachId) {
		this.coachId = coachId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Long getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(Long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getSpeciality() {
		return speciality;
	}

	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}

	@Override
	public String toString() {
		return "CoachDto [coachId=" + coachId + ", name=" + name + ", gender=" + gender + ", dateOfBirth=" + dateOfBirth
				+ ", password=" + password + ", mobileNumber=" + mobileNumber + ", speciality=" + speciality + "]";
	}
	

}
