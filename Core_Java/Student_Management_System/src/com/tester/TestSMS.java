package com.tester;

import static com.validation.StudentValidation.validateAllInputs;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import static com.utils.DataStore.*;

import com.institute.Student;

public class TestSMS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try(Scanner sc=new Scanner(System.in))
		{
			Map<String,Student> students=new HashMap<>();
			
			students=restoreDeatils();
			boolean exit=false;
			
			while(!exit)
			{
				System.out.println("1.Student Registration");
				System.out.println("2.Display All Students");
				System.out.println("3.Remove student if documents are not submitted");
				System.out.println("4.print student name from peticular city");
				System.out.println("Enter the Choice");
				try {
					
					switch(sc.nextInt())
					{
					case 1://registraion
						System.out.println("1.rollNo 2.firstName 3.lastName 4.email 5.adress 6.course(DAC,DBDA,DITISS,DAI) 7.qualification(MECH,ENTC,ELECT,COMP) 8.dob(AFTER 2000-01-01) 9.isDocSubmitted(true/false) 10.fees");
						Student s=validateAllInputs(sc.next(),sc.next() ,sc.next(),sc.next(),sc.next(),sc.next(),
								sc.next(),sc.next(), sc.next(),sc.nextDouble());
						students.put(s.getRollNo(), s);
						break;
						
					case 2://to display All students details
						students.forEach((k,v)->System.out.println(v));
						break;
					case 3://to remove student who has not submitted documents
						
						System.out.println("Enter student roll no");
						Student stud=students.get(sc.next());
						students.remove(stud);
					
						break;
						
					case 4://students names
						students.values().stream().filter(v->v.getAdress().equals("nashik")).forEach(v->System.out.println(v.getFirstName()));
						break;
						
					case 5://student sorting
					
					students.values().stream().sorted((a,b)->a.getDob().compareTo(b.getDob())).forEach(b->System.out.println(b));
					break;
					
					case 6://eamils of students who paid less than 70000
						students.values().stream().filter(v->v.getFees()<70000).forEach(v->System.out.println(v.getEmail()));
						break;
					case 7:
						exit=false;
						storeDeatils(students);
						break;
					}
					
		
				}catch(Exception e) 
				{
					e.printStackTrace();
					sc.nextLine();
				}
			}
			
	
		}
	     catch(Exception e) 
		{
			e.printStackTrace();
		}
	}

}
