package com.conatinment;
class Nib
{
	String material;
	int nibPrice;
	public Nib(String material,int nibPrice)
	{
		this.material=material;
		this.nibPrice=nibPrice;
	}
	public String toString()
	{
		return "material: "+material+" nib Price = "+nibPrice;
	}
}
class Pen
{
	String coloure;
	String name;
	int penPrice;
	Nib b;
	public Pen(String coloure, String name,int penPrice,Nib b)
	{
		this.coloure=coloure;
		this.name=name;
		this.penPrice=penPrice;
		this.b=b;
	}
	public String toString()
	{
		return"Coloure :"+coloure+" name : "+name+" pen price :"+penPrice+b;
	}
}


public class Bag {
	String brandName;
	int price;
	Pen p;
	public Bag(String brandName,int price, Pen p)
	{
		this.brandName=brandName;
		this.price=price;
		this.p=p;
	}
	public String toString()
	{
		return "brand name: "+brandName+" price: "+price+p;
		
	}
	public static void main(String[] args) {
		Bag obj = new Bag("American Tourister", 650, new Pen("nblue","ink pen", 10, new Nib("plastic", 3)));
		System.out.println(obj);
	}
	
	

}
