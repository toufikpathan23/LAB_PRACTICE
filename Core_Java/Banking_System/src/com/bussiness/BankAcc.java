package com.bussiness;

import java.time.LocalDate;

import com.customexception.BankingException;



public class BankAcc {
	
	private int acctNo;
	private String customerName;
	private AcctType type;
	private double balance;
	private LocalDate createdOn;
	private LocalDate lastUpdated;
	private boolean isActive;
	private static double minBal=500;
	
	public BankAcc(int acctNo, String customerName, AcctType type, double balance) {
		
		this.acctNo = acctNo;
		this.customerName = customerName;
		this.type = type;
		this.balance = balance;
		this.createdOn = LocalDate.now();
		this.lastUpdated =LocalDate.now();
		this.isActive = true;
	}

	public void withdraw(double amount) throws BankingException 
	{
		if(amount>(balance-minBal)&&!isActive)
			throw new BankingException("Insufficient Balance....");
		balance-=amount;
		lastUpdated=LocalDate.now();
	}
	
	public void deposit(double amount) throws BankingException
	{
		if(!isActive)
			throw new BankingException("Account is Inactive...");
		balance+=amount;
		
		lastUpdated=LocalDate.now();
			
	}
	
	public void transferFund(double amount,BankAcc b) throws BankingException
	{
		this.withdraw(amount);
		b.deposit(amount);
	}
	
}
