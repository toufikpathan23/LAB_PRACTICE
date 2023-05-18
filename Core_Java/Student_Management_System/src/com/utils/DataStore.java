package com.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

import com.institute.Student;

public class DataStore implements Serializable {

	
	//to store student details in persistent storage
	public static void storeDeatils(Map<String,Student> students) throws FileNotFoundException, IOException
	{
		try(
				ObjectOutputStream o=new ObjectOutputStream(new FileOutputStream("test")); ){
			
			o.writeObject(students);
			
		}
	}
	
	//to restore student details from persistent storage/binary file
	public static Map<String,Student>  restoreDeatils() throws FileNotFoundException, IOException, ClassNotFoundException {
		try(
				
				ObjectInputStream i=new ObjectInputStream(new FileInputStream("test"));)
		{
			
			return (Map<String,Student>)i.readObject();
			
		}catch(Exception e)
		{
			System.out.println("File is Empty.....");
			return new HashMap<>();
		}
	}
	}

