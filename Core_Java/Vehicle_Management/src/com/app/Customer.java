package com.app;

import java.time.LocalDate;

import com.CustomExcep.WeakPasswordException;
import com.plan.ServicePlan;

public class Customer {

	private int custId;
	private String cust_FName,cust_LName,email,password;
	private double reg_Amount;
	private LocalDate dob;
	private ServicePlan plan;
	private static int count;
	
	static
	{
		count=0;
	}
	public Customer() {
		
		this.custId=0;
		this.cust_FName = null;
		this.cust_LName = null;
		this.email = null;
		this.password = null;
		this.dob = LocalDate.now();
		this.reg_Amount=ServicePlan.SILVER.getPlanPrice();
		this.plan = ServicePlan.SILVER;
	}

	public Customer(String cust_FName, String cust_LName, String email, LocalDate dob, String password,ServicePlan plan,double reg_Amount) {
		this();// constructor chaining
		this.custId=++count;
		this.cust_FName = cust_FName;
		this.cust_LName = cust_LName;
		this.email = email;
		this.password = password;
		this.dob = dob;
		this.plan=plan;
		this.reg_Amount=reg_Amount;

	}

	public String getCust_FName() {
		return cust_FName;
	}

	public void setCust_FName(String cust_FName) {
		this.cust_FName = cust_FName;
	}

	public String getCust_LName() {
		return cust_LName;
	}

	public void setCust_LName(String cust_LName) {
		this.cust_LName = cust_LName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public ServicePlan getPlan() {
		return plan;
	}

	public void setPlan(ServicePlan plan) {
		this.plan = plan;
	}

	public int getCustId() {
		return custId;
	}

	public String getEmail() {
		return email;
	}

	public double getReg_Amount() {
		return reg_Amount;
	}
	
	public void show() throws 
	{
		
	}
	
	
}
