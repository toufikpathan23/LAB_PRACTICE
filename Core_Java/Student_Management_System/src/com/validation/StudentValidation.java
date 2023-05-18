package com.validation;

import java.io.Serializable;
import java.time.LocalDate;

import com.customexception.StudentValidationException;
import com.institute.Course;
import com.institute.Qualification;
import com.institute.Student;

public class StudentValidation implements Serializable {
	
	private static boolean check=false;

	public static  Student validateAllInputs(String rollNo, String firstName, String lastName, String email, String adress, String course,
			String qualification, String dob, String isDocSubmitted,double fees) throws StudentValidationException 
	{
		LocalDate vDob=validateDob(dob);
		Qualification qaulif=validateQualification(qualification);
		Course vCourse=validateCourse(course);
		boolean docSubmitted=Boolean.parseBoolean(isDocSubmitted);
		
		return new Student(rollNo,firstName,lastName,email,adress,vCourse,qaulif,vDob,docSubmitted,fees);//returns a new student
	}
	
	// doj validation
	public static LocalDate validateDob(String date) throws StudentValidationException
	{
		LocalDate vDate=LocalDate.parse(date);
		LocalDate fDate=LocalDate.parse("2000-01-01");
		if(vDate.isBefore(fDate))
				throw new StudentValidationException("Invali DOB...");
		return vDate;
	}
	
	//qualification validation
	public static Qualification validateQualification(String qual) throws StudentValidationException
	{
		try {
		return Qualification.valueOf(qual.toUpperCase());
		}catch (Exception e) 
		{
			throw new StudentValidationException("Invalid Qualification...");
		}
		
	}
	//course validation
	public static Course validateCourse(String course) throws StudentValidationException
		
	{
		try {
			return Course.valueOf(course.toUpperCase());
		}catch (Exception e) 
		{
			throw new StudentValidationException("Invalid Course selection...");
		}
		
	}
		
	
}
