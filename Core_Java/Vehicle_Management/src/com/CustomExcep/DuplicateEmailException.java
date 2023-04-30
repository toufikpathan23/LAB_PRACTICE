package com.CustomExcep;

import com.app.Customer;

public class DuplicateEmailException extends Exception {
	
	public DuplicateEmailException(String msg)
	{
		super(msg);
	}

	public static String emailCheck(String email,int index,Customer[] arr) throws DuplicateEmailException
	{
		
		if(index>0)
		{
			for(int i=0;i<index;i++)
			{
				if(arr[i].getEmail().equals(email))
				{
					throw new DuplicateEmailException("User already Exist with this Emial. Plz enter another EmailId.");
				}
			}
			return email;
		}
		else return email;
	}
}
