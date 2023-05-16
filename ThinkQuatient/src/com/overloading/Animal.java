package com.overloading;
class Dog
{
	void eat()
	{
		System.out.println("Dog is both veg and non-veg");
	}
}
class Cow extends Dog
{
	//in overriding keeps the access modifier same or 
	//provide higher access modifier than parent access modifier.
	public void eat ()//method signature must be same
	{
		System.out.println("Cow is veg");
		//super.eat();
	}
}
public class Animal {
	public static void main(String[] args) {
		Cow obj = new Cow();
		obj.eat();
	}

}
