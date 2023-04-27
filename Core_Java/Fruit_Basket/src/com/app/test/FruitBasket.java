package com.app.test;

import java.util.*;

import com.app.fruits.Fruit;
import com.app.fruits.*;

import static java.lang.System.*;
public class FruitBasket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean flag=true;
		Scanner sc=new Scanner(in);
		out.println("Enter the Number of fruits in the basket:");
		Fruit[] basket=new Fruit[sc.nextInt()];
		
		int ch,index=0;
		
		do {
			System.out.println("1.Add Mango 2.Add Orange 3.Add Apple 4.Name of all fruits 5.All fruit details 6.To make fruit stale 7.To make all sour fruits stale 8.To check Fruit speciality 9.To exit");
			ch=sc.nextInt();
			switch(ch)
			{
			case 1://add Mango
				if(index<basket.length)
				{
				System.out.println("Enter 1.Color 2.Mango_Name 3.Wieght");
				basket[index]=new Mango(sc.next(),sc.next(),sc.nextDouble());
				index++;
				}
				else 
				{
					System.out.println("Basket is Full...");
				}
				break;
			case 2://add Orange
				if(index<basket.length)
				{
				System.out.println("Enter 1.Color 2.Mango_Name 3.Wieght");
				basket[index]=new Orange(sc.next(),sc.next(),sc.nextDouble());
				index++;
				}
				else 
				{
					System.out.println("Basket is Full...");
				}
				break;
			case 3://add Apple
				if(index<basket.length)
				{
				System.out.println("Enter 1.Color 2.Mango_Name 3.Wieght");
				basket[index]=new Apple(sc.next(),sc.next(),sc.nextDouble());
				index++;
				}
				else 
				{
					System.out.println("Basket is Full...");
				}
				break;
			case 4:// to print names of fruits
				for(Fruit a:basket) 
				{
					if(a!=null) 	
					System.out.println("Name of Fruit:"+a.getName());
				}
				break;
			case 5://Fruit Details
				int i=1;
				for(Fruit a:basket) 
				{
					if(a!=null&&(a.isFresh()==true)) 	
					System.out.println(i+++"."+a);
				}
				break;
			case 6://To make fruit as stale
				System.out.println("Enter fruit Number:");
				int n=sc.nextInt();
				if((n-1)<index)
				{
					basket[n-1].setFresh(false);
					System.out.println("Fruit at Number "+n+":"+basket[n-1].getName()+" and stale.");
				}
				
				else
				{
					System.out.println("error occured.");
				}
				break;
			case 7://to make all sour fruits as stale
				;
				for(Fruit b:basket)
				{
					
					if(b!=null && b.taste()!="sweet")
					{
						b.setFresh(false);
						
					}
				}	
				System.out.println("ALL sour fruits made as stale.");
				break;
			case 8://to get fruit specific functionality
				System.out.println("Enter fruit Number:");
				int a=sc.nextInt();
				if((a-1)<index)
				{
					if(basket[(a-1)] instanceof Mango)
					{
						System.out.println(((Mango) basket[(a-1)]).pulp());
					}
					else if(basket[(a-1)] instanceof Orange)
					{
						System.out.println(((Orange) basket[(a-1)]).juice());
					}
					else if(basket[(a-1)] instanceof Apple) 
					{
						System.out.println(((Apple) basket[(a-1)]).jam());
					}
				}
				break;
			case 9://to exit
				System.out.println("Exit");
				flag=false;
				break;
			default:
				System.out.println("INVALID CHOICE...ENTER CHOICE AGAIN");
			}
		}while(flag);
		
	}

}
