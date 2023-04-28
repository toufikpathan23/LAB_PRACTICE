package com.licence;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.exception.LicenceValidException;

public class LicenceValidation {

	
	public static Date expDateChek(String expDate) throws ParseException,LicenceValidException
	{
	SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");// date format
	Date d=sdf.parse(expDate);//conversion of string to date
	Date day=new Date();
	if(d.after(day))//date validation
	
		return d;
	
	
	throw new LicenceValidException("Your Licence has been Expired, Plz renew soon..");
	}
	
}
