package com.principal.application;

public class PriorJob {

	private String newOrganization;
	private String designation;
	private Integer tenureMonth;
	private Integer tenureYear;
	public String getNewOrganization() {
		return newOrganization;
	}
	public void setNewOrganization(String newOrganization) {
		this.newOrganization = newOrganization;
		System.out.println("In PriorJob:newOrganization is----> "+this.newOrganization);
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
		System.out.println("In PriorJob:designation is----> "+this.designation);
	}
	public Integer getTenureMonth() {
		return tenureMonth;
	}
	public void setTenureMonth(Integer tenureMonth) {
		this.tenureMonth = tenureMonth;
		System.out.println("In PriorJob:tenureMonth is----> "+this.tenureMonth);
	}
	public Integer getTenureYear() {
		return tenureYear;
	}
	public void setTenureYear(Integer tenureYear) {
		this.tenureYear = tenureYear;
		System.out.println("In PriorJob:tenureYear is----> "+this.tenureYear);
	}
}
