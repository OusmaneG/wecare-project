package com.saraya.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Coach {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private String coachId;
	private String name;
	private char gender;
	private LocalDate dateOfBirth;
	private String password;
	private Long mobileNumber;
	private String speciality;
		
	public Coach() {}

	public Coach(String name, char gender, LocalDate dateOfBirth, String password,
			Long mobileNumber, String speciality) {
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
		return "Coach [coachId=" + coachId + ", name=" + name + ", gender=" + gender + ", dateOfBirth="
				+ dateOfBirth + ", password=" + password + ", mobileNumber=" + mobileNumber + ", speciality="
				+ speciality + "]";
	}
	
	

}
