package com.app.fruits;

public class Orange extends Fruit {

	public Orange(String color,String name,double wieght) {
		super(color,name, wieght);
		// TODO Auto-generated constructor stub
	}

	public  String taste() 
	{
	    return "sour";
	}
	public String juice()
	{
		return "Wieght:"+this.getWieght()+" Used For: extracting juice!";
	}
	
	@Override
	public String toString()
	{
		return super.toString()+" Taste:"+this.taste();
	}
	
}
