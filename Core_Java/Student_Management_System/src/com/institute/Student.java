package com.institute;

import java.io.Serializable;
import java.time.LocalDate;

public class Student implements Serializable{

	private String rollNo,firstName,lastName,email,adress;
	private Course course;
	private Qualification qualification;
	private LocalDate dob;
	private double fees;
	boolean isDocSubmitted;
	
	
	public Student(String rollNo, String firstName, String lastName, String email, String adress, Course course,
			Qualification qualification, LocalDate dob, boolean isDocSubmitted,double fees) {
		
		this.rollNo = rollNo;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.adress = adress;
		this.course = course;
		this.qualification = qualification;
		this.dob = dob;
		this.isDocSubmitted = isDocSubmitted;
		this.fees=fees;
	}




	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", adress=" + adress + ", course=" + course + ", qualification=" + qualification + ", dob=" + dob
				+ ", fees=" + fees + ", isDocSubmitted=" + isDocSubmitted + "]";
	}




	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getAdress() {
		return adress;
	}


	public void setAdress(String adress) {
		this.adress = adress;
	}


	public Qualification getQualification() {
		return qualification;
	}


	public void setQualification(Qualification qualification) {
		this.qualification = qualification;
	}


	public boolean isDocSubmitted() {
		return isDocSubmitted;
	}


	public void setDocSubmitted(boolean isDocSubmitted) {
		this.isDocSubmitted = isDocSubmitted;
	}


	public String getRollNo() {
		return rollNo;
	}


	public String getEmail() {
		return email;
	}


	public Course getCourse() {
		return course;
	}


	public LocalDate getDob() {
		return dob;
	}


	public double getFees() {
		return fees;
	}
	
	
	
}
