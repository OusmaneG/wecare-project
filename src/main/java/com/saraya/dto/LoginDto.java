package com.saraya.dto;

public class LoginDto {
	
	String id;
	String password;
	
	public LoginDto() {}

	protected LoginDto(String id, String password) {
		super();
		this.id = id;
		this.password = password;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "LoginDto [id=" + id + ", password=" + password + "]";
	}
	
	

}
