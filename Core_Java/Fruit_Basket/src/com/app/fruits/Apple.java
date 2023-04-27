package com.app.fruits;

public class Apple extends Fruit {

	public Apple(String color,String name,double wieght) {
		super(color,name, wieght);
		// TODO Auto-generated constructor stub
	}

	public  String taste() 
	{
	    return "sweet n sour";
	}
	public String jam()
	{
		return  "Name:"+this.getName()+" Used For: making jam!";
	}
	
	@Override
	public String toString()
	{
		return super.toString()+" Taste:"+this.taste();
	}
}
