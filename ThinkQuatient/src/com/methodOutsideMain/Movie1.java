package com.methodOutsideMain;

public class Movie1 {
	
	int id;
	String name;
	Double price;
	public Movie1(int id, String name, double price)
	{
		this.id=id;
		this.name=name;
		this.price=price;
	}
	public double discount(double coupan)
	{
		if(coupan==100)
		{
			price=price-price*0.15;
		}
		else if(coupan==200)
		{
			price=price-price*0.1;
		}
		else
		{
		 price=price;
		}
		return price;
	}

}
