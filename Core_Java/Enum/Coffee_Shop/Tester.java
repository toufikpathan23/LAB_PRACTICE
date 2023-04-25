package com.num;

import java.util.Scanner;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		Scanner sc=new Scanner(System.in);
		int ch;
		
		Coffee[] menu=Coffee.values();
		System.out.println("1.Menu Card 2.Take Order 3.Exit");
		do {
			
			System.out.println("Enter the choice");
			ch=sc.nextInt();
		switch(ch)
		{
		case 1:// Menu Card
			System.out.println("------------------------------------------");
			for(Coffee c:menu)
			{
				System.out.println(c);
			}
			break;
		case 2:// take order
			System.out.println("------------------------------------------");
			System.out.println("What would u like to have,Sir.");
			Coffee s=Coffee.valueOf(sc.next());
			
			System.out.println(s);
			break;
		case 3:
			System.out.println("Thank You. Enjoy ur coffee.");
			
		}
		}while(ch!=4);
	}

}
