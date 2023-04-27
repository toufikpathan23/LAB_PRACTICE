package com.app.fruits;

public abstract class Fruit {

	private String color,name;
	private double wieght;
	private boolean fresh=true;
	
	public Fruit(String color, String name, double wieght) {
		
		this.color = color;
		this.name = name;
		this.wieght = wieght;
	}
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getWieght() {
		return wieght;
	}

	public void setWieght(double wieght) {
		this.wieght = wieght;
	}

	public boolean isFresh() {
		return fresh;
	}

	public void setFresh(boolean fresh) {
		this.fresh = fresh;
	}

	public abstract String taste();
	
	@Override
	public String toString() 
	{
		return "Name:"+name+" color:"+color+" weight:"+wieght;
	}
}
