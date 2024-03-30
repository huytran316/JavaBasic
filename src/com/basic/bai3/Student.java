package com.basic.bai3;

import java.util.Scanner;

public class Student {
	
	private String fullName;
	private String address;
	private String dob;
	private String gender;
	private float finalGrade;

	public Student(String fullName, String address, String dob, String gender, float finalGrade) {
		this.fullName = fullName;
		this.address = address;
		this.dob = dob;
		this.gender = gender;
		this.finalGrade = finalGrade;
	}
	

	public void setfullName(String fullName) {
		this.fullName = fullName;
	}
	public String getfullName() {
		return fullName;
	}
	public void setaddress(String address) {
		this.address = address;
	}
	public String getaddress() {
		return address;
	}
	public void setdob(String dob) {
		this.dob = dob;
	}
	public String getdob() {
		return dob;
	}
	public void setgender(String gender) {
		this.gender = gender;
	}
	public String getgender() {
		return gender;
	}
	public void setfinalGrade(float finalGrade) {
		this.finalGrade = finalGrade;
	}
	public float getfinalGrade() {
		return finalGrade;
	}

}
