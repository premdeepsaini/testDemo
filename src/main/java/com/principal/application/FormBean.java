package com.principal.application;

import java.util.Date;

import javax.annotation.PostConstruct;

public class FormBean {

	private String username;
	private String password;

	private PriorJob priorJob;

//	@PostConstruct
//	public void init() {
//
//		PriorJob priorJob = new PriorJob();
//	}

	public PriorJob getPriorJob() {
		return priorJob;
	}

	public void setPriorJob(PriorJob priorJob) {
		this.priorJob = priorJob;
	}

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

	public String submit() {
		System.out.println("==================================================================================");
		System.out.println(username + "\t" + password + "\t" + this.username);
		
		
		
		return "index";

	}

	public String clear() {
		setUsername(null);
		setPassword(null);
		return null;
	}
}
