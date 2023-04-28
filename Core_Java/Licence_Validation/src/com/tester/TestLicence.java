package com.tester;
import static com.licence.LicenceValidation.expDateChek;

import java.util.Date;
import java.util.Scanner;

public class TestLicence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try(Scanner sc=new Scanner(System.in);)
		{
			System.out.println("Enter the Expiry Date:dd-mm-yyyy");// expDate from user
			Date d=expDateChek(sc.next());
			System.out.println("Your licence will expire on:"+d);
			System.out.println("End of Try...");
		}//close
		catch(Exception e) 
		{
			System.out.println(e.getMessage());
		}
		
		
	}

}
