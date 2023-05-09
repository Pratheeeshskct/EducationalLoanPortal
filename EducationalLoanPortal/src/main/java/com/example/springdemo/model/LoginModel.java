package com.example.springdemo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class LoginModel {
	@Id
	private String Email;
	private String password;
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}

}
