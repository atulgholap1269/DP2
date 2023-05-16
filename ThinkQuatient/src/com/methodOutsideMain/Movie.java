package com.methodOutsideMain;

public class Movie {
	int id;
	String movieName;
	int price;
	int coupan;
	Movie(int id, String movieName, int price, int coupan)
	{
	this.id=id;
	this.movieName=movieName;
	this.price=price;
	this.coupan=coupan;
	}
	void showDetails()
	{
		System.out.println("movie id:"+id);
		System.out.println("movie name:"+movieName);
		System.out.println("movie coupan:"+coupan);
	}
	
	int getPrice()
	{
		return price;
	}
	

}
