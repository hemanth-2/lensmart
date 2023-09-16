package com.example.demo.model;

import org.springframework.stereotype.Component;


import jakarta.persistence.Id;


@Component
public class LoginModel {
	@Id
	private String email;
	private String password;
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public LoginModel(String email, String password) {
		super();
		this.email = email;
		this.password = password;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public LoginModel() {
		super();
	}
	
	
	
}
