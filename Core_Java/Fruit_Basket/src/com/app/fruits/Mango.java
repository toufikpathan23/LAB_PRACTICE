package com.app.fruits;

public class Mango extends Fruit{

	public Mango(String color,String name,double wieght) {
		super(color,name, wieght);
		// TODO Auto-generated constructor stub
	}

	public  String taste() 
	{
	    return "sweet";
	}
	public String pulp()
	{
		return "Name:"+this.getName()+" Color:"+this.getColor()+"Used For: Creating pulp";
	}
	
	public String toString()
	{
		return super.toString()+" Taste:"+this.taste();
	}
	
}
