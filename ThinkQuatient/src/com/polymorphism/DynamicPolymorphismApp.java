package com.polymorphism;
class Vehical
{
	public void move()
	{
		System.out.println("Vehical is move on road");
	}
}
class Car extends Vehical
{
	public void move()
	{
		super.move();
		System.out.println("Car is move horizantally on road");
	}
}
class Helicoptar extends Vehical
{
	public void move()
	{
		System.out.println("Helicoptar is move vertically up in sky");
	}
}
public class DynamicPolymorphismApp {
public static void main(String[] args) {
	Vehical v= new Car();
	v.move();//binding will takes place at the time of execution
	v=new Helicoptar();
	v.move();
}
}
