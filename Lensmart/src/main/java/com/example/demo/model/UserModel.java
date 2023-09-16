package com.example.demo.model;



import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class UserModel {

	@Id
	private String email;
	private String password;
	private String userName;
	private String mobileNumber;
	private String active;
	private String role="user";
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getActive() {
		return active;
	}
	public void setActive(String active) {
		this.active = active;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public UserModel( String email, String password, String userName, String mobileNumber, String active,
			String role) {
		super();
		this.email = email;
		this.password = password;
		this.userName = userName;
		this.mobileNumber = mobileNumber;
		this.active = active;
		this.role = role;
	}
	public UserModel() {
		super();
	}
	
	
	
}
