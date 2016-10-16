package com.principal.application;

import java.util.Date;

public class FormBean {

	private String username;
	private String password;
	private Date date;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
		System.out.println(this.username);
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
		System.out.println(this.password);
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
}
