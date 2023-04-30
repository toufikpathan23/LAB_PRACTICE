package com.tester;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import com.CustomExcep.DuplicateEmailException;
import com.CustomExcep.WeakPasswordException;
import com.app.Customer;
import com.plan.ServicePlan;

import static com.app.Customer.*;

public class TestApplication {

	//@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) {
		try {
		Scanner sc=new Scanner(System.in);
		boolean flag=true;
		System.out.println("Eneter the number of Vacancy:");
		Customer[] arr=new Customer[sc.nextInt()];
		
		int ch,index=0;
		
		
		do {
			System.out.println("Enter the choice:1.Register 2.Choose Plan 3.");
			ch=sc.nextInt();
			
			switch(ch) 
			{
			case 1://Customer Registration
				if(index<arr.length)
				{
					System.out.println("Enter First and Last Name.");
					String fname=sc.next();
					String lname=sc.next();
					System.out.println("Enetr your emailId.");
					String email=DuplicateEmailException.emailCheck(sc.next(),index,arr);//duplicate email checking
					System.out.println("Enter Date of Birth in:dd-MM-yyyy");
					LocalDate dob=LocalDate.parse(sc.next(),DateTimeFormatter.ofPattern("dd-MM-yyyy"));
					
					System.out.println("Enter Password");
					String pass=WeakPasswordException.passCheck(sc.next());// weak password checking exception
					
					//to select plan
					System.out.println("Choose Plan:");
					for(ServicePlan p:ServicePlan.values()) 
					{
						System.out.println(p+" "+p.getPlanPrice()+".Rs");
					}
					System.out.println("Enter your choice of plan:");
					ServicePlan plan=ServicePlan.valueOf((sc.next().toUpperCase()));
					double reg_Amount=plan.getPlanPrice();
					System.out.println("Total Amount of plan is:"+reg_Amount);
					
					//user added
					arr[index++]=new Customer(fname,lname,email,dob,pass,plan,reg_Amount);
					System.out.println("User Added with CustId:"+arr[index-1].getCustId());
					
				}
				else
				{
					System.out.println("No Vacancy for Vehicle..");
				}
				break;
				
			case 2:
				break;
			
			}
		}while(flag);
	 }
		catch(Exception e) 
		{
			System.out.println(e.getMessage());
			
		}
	}

}
