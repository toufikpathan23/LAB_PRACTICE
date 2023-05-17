package com.tester;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.bussiness.AcctType;
import com.bussiness.BankAcc;

public class TestBank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try(Scanner sc=new Scanner(System.in))
		{
			Map<Integer,BankAcc> acc=new HashMap<>();
			
			boolean exit=false;
			
			while(!exit) 
			{
				System.out.println("1.Create Account 2.Show List of all accounts 3.Deposit Amount 4.Withdraw Amount 5.Transfer Funds");
				System.out.println("Enter the choice");
				try
				{
					switch(sc.nextInt()) 
					{
					case 1://create new account
						System.out.println("Enter User details:1.acctNo 2.customerName 3.AcctType type 4.balance");
						BankAcc acc1=validateAllInputs(sc.nextInt(),sc.nextLine(),sc.next(),sc.nextDouble());
						break;
					
					}
					
				} catch (Exception e1)
				{
					  e1.printStackTrace();	
					  sc.nextLine();
					}
				
			}
			
		}catch (Exception e)
		{
		  e.printStackTrace();	
		}
	}

}
